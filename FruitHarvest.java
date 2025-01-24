/**
 * Author: Robyn Doyle 
 * Date: January 20, 2025
 * Description: This program asks the user to input the number of baskets collected.
 * (Decision was made to not use a switch to input basket info, since this would make the input process tedious and long)
 * Program then calculates the pay due to the Picker. Then it asks if user wants to input info for another Picker.
 * Once all Pickers info has been entered, the program outputs the days highest earning Picker and stats. 
 */

 // import Scanner for user input
import java.util.Scanner;

public class FruitHarvest {

    public static void main(String[] args){

        // Set up the user input
        Scanner keyboardIn = new Scanner(System.in);

        //Set up variables
        char continueAnotherPicker = 'y'; // Setting this to 'y' will allow initial entry into the while loop
        Integer numberOfPickers = 0; // Counter to check how many Pickers were processed in this cycle. 
        Integer smallBasketCounter, mediumBasketCounter, largeBasketCounter, overallSmallBasketCounter = 0, overallMediumBasketCounter = 0, overallLargeBasketCounter = 0, overallTotalBasketCounter = 0;
        double earningsSmall, earningsMedium, earningsLarge, totalEarningsWithoutBonus, bonus = 0, totalEarningsWithBonus, overallTotalPayment = 0; //Cash variables with decimal precision. 
        Integer highestPicker = 1; // Tracks the picker with the highest payment. 
        double highestPickerAmount = 0; // Counts the earnings of todays highest paid picker. 


        System.out.println();  
        System.out.println("***************************************************************************");

        
        // While loop that runs when sentinel variable is set to 'y' or 'Y'. This runs until user escapes the loop with 'n'. 
        while (continueAnotherPicker == 'y' || continueAnotherPicker == 'Y') {
            System.out.println();
            numberOfPickers++;
            System.out.println("Picker #" + numberOfPickers + ": Input");
            System.out.println("\tEnter the number of baskets of fruit you collected per basket size");
            
            // Taking input for Small baskets quantity. Wont accept negative numbers. 
            do {
                System.out.print("\tSmall Basket Quantity: ");
                smallBasketCounter = keyboardIn.nextInt();
                if (smallBasketCounter < 0) {
                    System.out.println("Invalid input. Basket quantity needs to be positive number");
                }
            } while (smallBasketCounter < 0);

            // Adds number of small baskets entered to an overall small basket counter
            overallSmallBasketCounter = overallSmallBasketCounter + smallBasketCounter;

            // Taking input for Medium baskets quantity. Wont accept negative numbers. 
            do {
                System.out.print("\tMedium Basket Quantity: ");
                mediumBasketCounter = keyboardIn.nextInt();
                if (mediumBasketCounter < 0) {
                    System.out.println("Invalid input. Basket quantity needs to be positive number");
                }
            } while (mediumBasketCounter < 0);

            // Adds number of Medium baskets entered to an overall Medium basket counter
            overallMediumBasketCounter = overallMediumBasketCounter + mediumBasketCounter;
            
            // Taking input for Large baskets quantity. Wont accept negative numbers. 
            do {
                System.out.print("\tLarge Basket Quantity: ");
                largeBasketCounter = keyboardIn.nextInt();
                if (largeBasketCounter < 0) {
                    System.out.println("Invalid input. Basket quantity needs to be positive number");
                }
            } while (largeBasketCounter < 0);
            
            // Adds number of Large baskets entered to an overall Large basket counter
            overallLargeBasketCounter = overallLargeBasketCounter + largeBasketCounter;
            
            System.out.println();
            System.out.println("***************************************************************************");


            // Calculate earnings per basket type
            earningsSmall = (double)smallBasketCounter * 6;
            earningsMedium = (double)mediumBasketCounter * 8;
            earningsLarge = (double)largeBasketCounter * 12;
            totalEarningsWithoutBonus = earningsSmall + earningsMedium + earningsLarge; 

            // Calculates 15% Bonus, if bonus threshold 1 is reached.
            if (totalEarningsWithoutBonus > 30 && totalEarningsWithoutBonus < 40){
                bonus = totalEarningsWithoutBonus * .15;
                totalEarningsWithBonus = totalEarningsWithoutBonus + bonus;
            } // Calculates 25% Bonus, if bonus threshold 2 is reached.
            else if (totalEarningsWithoutBonus > 40){
                bonus = totalEarningsWithoutBonus * .25;
                totalEarningsWithBonus = totalEarningsWithoutBonus + bonus;
            }
            // Setting the final total to be equal to a total without a bonus if no threshold is reached.
            else {
                totalEarningsWithBonus = totalEarningsWithoutBonus;
            }
            
            // sets the highest picker container to match the current pickers number. Tracks who the highest Pickers is. 
            if (totalEarningsWithBonus > highestPickerAmount){
                highestPickerAmount = totalEarningsWithBonus;
                highestPicker = numberOfPickers; 
            }

            // Tracks the overall total to be paid by farmer. 
            overallTotalPayment = overallTotalPayment + totalEarningsWithBonus;

            // Outputs Summary data.
            System.out.println(); System.out.println(); 
            System.out.println("Picker #" + numberOfPickers + ": Review");
            System.out.println("\tNumber of baskets collect = " + (smallBasketCounter + mediumBasketCounter + largeBasketCounter));  
            System.out.println(String.format("\tEarnings for Small Baskets: $%.2f", earningsSmall));
            System.out.println(String.format("\tEarnings for Medium Baskets: $%.2f", earningsMedium));
            System.out.println(String.format("\tEarnings for Large Baskets = $%.2f", earningsLarge));
            System.out.println(String.format("\tTotal Basket earnings without any bonus = $%.2f", totalEarningsWithoutBonus));

            // Only outputs bonus value, if a bonus has indeed been allocated. 
            if (totalEarningsWithoutBonus != totalEarningsWithBonus){
                System.out.println(String.format("\tTotal Basket earnings with added bonus = $%.2f", totalEarningsWithBonus));
            }

            System.out.println();
            System.out.println("***************************************************************************\n");

            // Asks to continue or to repeat input process for another picker. 
            do {
                System.out.print("Process another picker? (y/n): ");
                continueAnotherPicker = keyboardIn.next().charAt(0);
                if (continueAnotherPicker != 'y' && continueAnotherPicker != 'n' && continueAnotherPicker != 'Y' && continueAnotherPicker != 'N') {
                    System.out.println("Invalid input! Please enter 'y' or 'n'.");
                }
            } while (continueAnotherPicker != 'y' && continueAnotherPicker != 'n' && continueAnotherPicker != 'Y' && continueAnotherPicker != 'N');
            
            System.out.println();

            System.out.println("***************************************************************************\n");

        }
    // Caclulates total amount of baskets.     
    overallTotalBasketCounter = overallSmallBasketCounter + overallMediumBasketCounter + overallLargeBasketCounter;
    
    // Outputs Summary data.
    System.err.println("Total number of fruit picker: " + numberOfPickers);

    System.out.println("Total baskets collected: " + overallTotalBasketCounter);   
    System.err.println("Total small baskets: " + overallSmallBasketCounter);    
    System.err.println("Total medium baskets: " + overallMediumBasketCounter);   
    System.out.println("Total large baskets: " + overallLargeBasketCounter); 

    System.out.println(String.format("Total paid out: $%.2f", overallTotalPayment));
    System.out.println(String.format("Todays Top Picker is Picker no. " + highestPicker + " with an amount of $%.2f", highestPickerAmount)); 
    System.out.println();  
    System.out.println("***************************************************************************");

    // Closes the user input Scanner.
    keyboardIn.close();


    }
    
}
