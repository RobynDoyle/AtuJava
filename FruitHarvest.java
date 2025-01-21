/**
 * Author: Robyn Doyle 
 * Date: January 20, 2025
 * Description: This program asks the user to input the number of baskets collected.
 * It then calculates the pay due to the Picker. Then it asks if user wants to input info for another Picker.
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
        
        Integer smallbasketNumber, mediumbasketNumber, largebasketNumber, overallSmallbasketNumber = 0, overallMediumbasketNumber = 0, overallLargebasketNumber = 0, overallTotalBasketNumber = 0;
        double earningsSmall, earningsMedium, earningsLarge, totalCollectionCalculation1, bonus, totalCollectionCalculation2, overallTotalPayment = 0;
        double highestPickerAmount = 0;
        Integer highestPicker = 1;
        
        
        while (continueAnotherPicker == 'y') {
            System.err.println();
            numberOfPickers++;
            System.out.println("Picker #" + numberOfPickers + ":");
            System.out.println("\tEnter the number of baskets of fruit you collected per basket size");
            
            // Taking input for baskets quantity
            System.out.print("\tSmall Basket Quantity:");
            smallbasketNumber = keyboardIn.nextInt();
            overallSmallbasketNumber = overallSmallbasketNumber + smallbasketNumber;
            System.out.print("\tMedium Basket Quantity:");
            mediumbasketNumber = keyboardIn.nextInt();
            overallMediumbasketNumber = overallMediumbasketNumber + mediumbasketNumber;
            System.out.print("\tLarge Basket Quantity:");
            largebasketNumber = keyboardIn.nextInt();
            overallLargebasketNumber = overallLargebasketNumber + largebasketNumber;
            System.out.println();
            System.out.println("***************************************************************************");


            // Calculate earnings per basket type
            earningsSmall = (double)smallbasketNumber * 6;
            earningsMedium = (double)mediumbasketNumber * 8;
            earningsLarge = (double)largebasketNumber * 12;
            totalCollectionCalculation1 = earningsSmall + earningsMedium + earningsLarge; 

            if (totalCollectionCalculation1 > 30 && totalCollectionCalculation1 < 40){
                bonus = totalCollectionCalculation1 * .15;
                totalCollectionCalculation2 = totalCollectionCalculation1 + bonus;
            }
            else if (totalCollectionCalculation1 > 40){
                bonus = totalCollectionCalculation1 * .25;
                totalCollectionCalculation2 = totalCollectionCalculation1 + bonus;
            }
            // Setting the final total to be equal to a total without a bonus.
            else {
                totalCollectionCalculation2 = totalCollectionCalculation1;
            }
            
            if (totalCollectionCalculation2 > highestPickerAmount){
                highestPickerAmount = totalCollectionCalculation2;
                // sets the highest picker container to match the current pickers number. 
                highestPicker = numberOfPickers; 

            }

            overallTotalPayment = overallTotalPayment + totalCollectionCalculation2;
            System.out.println(); System.out.println(); 

            System.out.println("Picker #" + numberOfPickers);
            System.out.println("\tNumber of baskets collect = " + (smallbasketNumber + mediumbasketNumber + largebasketNumber));
             
            System.out.println("\tEarnings for Small Baskets = $" + earningsSmall);
            System.out.println("\tEarnings for Medium Baskets = $" + earningsMedium);
            System.out.println("\tEarnings for Large Baskets = $" + earningsLarge);
            System.out.println("\tTotal Basket earnings without any bonus = $" + totalCollectionCalculation1);

            if (totalCollectionCalculation1 != totalCollectionCalculation2){
                System.out.println("\tTotal Basket earnings with added bonus = $" + totalCollectionCalculation2);
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
    overallTotalBasketNumber = overallSmallbasketNumber + overallMediumbasketNumber + overallLargebasketNumber;
    
    System.err.println("Total number of fruit picker: " + numberOfPickers);

    System.out.println("Total baskets collected: " + overallTotalBasketNumber);   
    System.err.println("Total small baskets: " + overallSmallbasketNumber);    
    System.err.println("Total medium baskets: " + overallMediumbasketNumber);   
    System.out.println("Total large baskets: " + overallLargebasketNumber); 

    System.out.println("Total paid out: " + overallTotalPayment);
    System.out.println("Todays Top Picker is Picker no. " + highestPicker + " with an amount of " + highestPickerAmount); 
    System.out.println();  
    System.out.println("***************************************************************************");

    // Close the Scanner
    keyboardIn.close();


    }
    
}
