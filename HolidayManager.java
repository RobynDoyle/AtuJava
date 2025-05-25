import java.io.*;
import java.util.Scanner;

public class HolidayManager {
    public static void main(String[] args) throws IOException
    {
        
        Scanner keyboardIn = new Scanner(System.in);
        startMenu(keyboardIn);
        keyboardIn.close(); // close the scanner instance.

    }// close main method

    public static void startMenu(Scanner keyboardIn) throws IOException
    { 
        
        int choiceMenu1; // initialise var

        do {

            System.out.println("**************************************************************************\nWelcome to the Start Menu!\nDo you wish to write new holiday data or use data already on file?");
            System.out.println("1: Write new holiday data to file");
            System.out.println("2: Use sample holiday data already on file");
            System.out.println("0. Exit");
            System.out.print("Input:");
            choiceMenu1 = keyboardIn.nextInt(); // gets user input.

            switch (choiceMenu1) {
                case 1: // here we enter new data into the holidays.txt file
                    System.out.println("Add new data to the file");
                    addHolidays(keyboardIn); // enter new data
                    holidayMenu(keyboardIn); // continue to Menu 2.
                    break;
                case 2:
                    System.out.println("Using existing sample data on file");
                    holidayMenu(keyboardIn);
                    break;
                case 0: 
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("**************************************************************************\nINVALID INPUT! Please select 1, 2, or 0 to try again.");
            }


        } while (choiceMenu1 != 0 ); // dont close the menu until 0 is selected
    } // close start menu method

    public static void addHolidays(Scanner keyboardIn) throws IOException {
         // Initialise input variables.
         String destinationIn, deptAirportIn;
         int durationIn; 
         double costIn;
         char ans;
 
         
         FileWriter holidayFile = new FileWriter("holidays.txt"); //create a file writer object called fw
         PrintWriter pw = new PrintWriter(holidayFile); // create a PrintWriter object pw that has file writer object passed to it. 
 
         do {
             // Get user input for holiday data.
             System.out.println("Enter Destination:");
             destinationIn = keyboardIn.next();
             System.out.println("Enter Departure Airport:");
             deptAirportIn = keyboardIn.next();
             System.out.println("Enter Total Cost of Holiday:");
             costIn = keyboardIn.nextDouble();
             System.out.println("Enter Duration (Days):");
             durationIn = keyboardIn.nextInt();
             
             // Create a holiday object with given data
             Holiday holidayObject = new Holiday(destinationIn, deptAirportIn, durationIn, costIn);
 
             pw.println(holidayObject.toString());  // print data to file
 
             System.out.print("Would you like to add another holiday (Y/N): "); // Asks user if the want to exit or continue
             ans = keyboardIn.next().charAt(0);
 
       } while(ans == 'y' || ans == 'Y');  //continue entering holidays if = to y
         
         
 
         pw.close(); // close the File Writer.
         
         System.out.println("File created and saved");
    } // close addHoliday method

    public static void holidayMenu(Scanner keyboardIn) throws IOException {
        int choiceMenu2; //initialise choise var

        // menu print
        do { 
            System.out.println("**************************************************************************\nHoliday Menu");
            System.out.println("1. View all holidays ");
            System.out.println("2. View holiday(s) within a given price range ");
            System.out.println("3. Display details of the cheapest holiday ");
            System.out.println("4. Remove a holiday");
            System.out.println("5. Update holiday details ");
            System.out.println("0. Exit ");
            System.out.print("Input:");
            choiceMenu2 = keyboardIn.nextInt(); // takes user input
            
            // user choice gets assigned to method to be executed.
            switch (choiceMenu2) {
                case 1:
                    System.out.println("**************************************************************************\nView all holidays");
                    break;
                case 2:
                    System.out.println("**************************************************************************\nView holiday(s) within a given price range ");
                    break;
                case 3:
                    System.out.println("**************************************************************************\nDisplay details of the cheapest holiday");
                    break;
                case 4:
                    System.out.println("**************************************************************************\nRemove a holiday");
                    break;
                case 5:
                    System.out.println("**************************************************************************\nUpdate holiday details");
                    break;
                case 0:
                    System.out.println("**************************************************************************\nReturning to Start Menu");
                    break;
                default:
                    System.out.println("**************************************************************************\nINVALID INPUT! Please select 1, 2, 3, 4, 5 or 0 to try again.");
            }
        } while (choiceMenu2 != 0);//&& choiceMenu2 != 1 && choiceMenu2 != 2 && choiceMenu2 != 3 && choiceMenu2 != 4 && choiceMenu2 != 5);
           
        
    } // close holidayMenu method

}//close class
