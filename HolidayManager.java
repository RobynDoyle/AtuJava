/*Assessment 2 Holiday Manager program
Student: Robyn Doyle
Student Number: L00188328 */
import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
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
        
        int choiceMenu1 = 10; // initialise var

        do {

            System.out.println("**************************************************************************\nWelcome to the Start Menu!\nDo you wish to write new holiday data or use data already on file?");
            System.out.println("1: Write new holiday data to file");
            System.out.println("2: Use sample holiday data already on file");
            System.out.println("0. Exit");
            System.out.print("Input:");
            
            try { choiceMenu1 = keyboardIn.nextInt(); // gets user input.
            } catch (InputMismatchException ex) {
                System.out.println("Please enter a valid number.");
                keyboardIn.nextLine(); // clears the bad input that we dont want, like flushing
                continue; 
            }


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
             // check to ensure program does not crash if wrong data type is entered
             while (!keyboardIn.hasNextDouble()){
                System.out.println("INALID INPUT: Enter a data type compatible with Double: ");
                keyboardIn.next(); // moves on 
             }
             costIn = keyboardIn.nextDouble();


             System.out.println("Enter Duration (Days):");
             // check to ensure program does not crash if wrong data type is entered
             while (!keyboardIn.hasNextInt()){
                System.out.println("INALID INPUT: Enter a data type compatible with Integer: ");
                keyboardIn.next(); // moves on 
             }
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
        int choiceMenu2 = 10; //initialise choice var
        List<Holiday> listHoliday =  loadHolidayRecords(); // Load the data from the file as a List of Holiday Objects

        // menu print
        do { 
            System.out.println("**************************************************************************\nHoliday Menu");
            System.out.println("1. View all holidays");
            System.out.println("2. View holiday(s) within a given price range");
            System.out.println("3. Display details of the cheapest holiday");
            System.out.println("4. Remove a holiday");
            System.out.println("5. Update holiday details");
            System.out.println("0. Exit to Start Menu");
            System.out.print("Input:");
            
            
            try{
                choiceMenu2 = keyboardIn.nextInt(); // takes user input
            } catch (InputMismatchException ex) {
                System.out.println("Please enter a valid number.");
                keyboardIn.nextLine(); // clears the bad input that we dont want, like flushing
                continue; 
            }

           
            
            // user choice gets assigned to method to be executed.
            switch (choiceMenu2) {
                case 1:
                    System.out.println("**************************************************************************\nView all holidays");
                    viewAllHolidays(listHoliday);
                    break;
                case 2:
                    System.out.println("**************************************************************************\nView holiday(s) within a given price range ");
                    viewHolidaysInRange(listHoliday, keyboardIn);
                    break;
                case 3:
                    System.out.println("**************************************************************************\nDisplay details of the cheapest holiday");
                    viewHolidaysCheapest(listHoliday, keyboardIn);
                    break;
                case 4:
                    System.out.println("**************************************************************************\nRemove a holiday");
                    removeHoliday();
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


    // a method that loads the data from the File once, so we dont need to keep opening the file. it returns a List object.
    public static List<Holiday> loadHolidayRecords() throws IOException {
        List<Holiday> listHoliday = new ArrayList<>(); // create the Array List object to hold the data.
        File readHolidayFile = new File("holidays.txt"); // we read the holiday file

        // check if the file reader found the file and connected.
        if(!readHolidayFile.exists()){
            System.out.println("File connection unsuccessful. Double check that the file is in correct directory");
        }
        // sets up the scanner to take the input from the file.
        Scanner input = new Scanner(readHolidayFile);

      

        // iterate through the file and append each line to the Array Holiday Object List
        while (input.hasNextLine()) {
            String line = input.nextLine();
            try {
                Holiday holiday = Holiday.makeString(line);
                listHoliday.add(holiday);
            } catch (Exception e) {
                System.out.println("Issue in File");
            }
        }

          // check if the Array List has less then 0 entries. if true then the file is empty. 
          if (listHoliday.isEmpty()){
            System.out.println("File is empty, try adding some data first via the Start Menu");
        }

        input.close(); // close the input scanner object

        return listHoliday; // return the List object so we can use it in other methods.    
    }

    public static void viewAllHolidays(List<Holiday> listHoliday) {
     
        // check if list and therefore file is empty
        if (listHoliday.isEmpty()) {
            System.out.println("No holiday records on file");
        }
        else {   // loop through the records in the Holiday List
            for (Holiday holidayRecord : listHoliday) {
                System.out.println(holidayRecord);
            }  
        }
        
    } // close method

    public static void viewHolidaysInRange(List<Holiday> listHoliday, Scanner keyboardIn) {
        if (listHoliday.isEmpty()) {  // check if list and therefore file is empty
            System.out.println("No holiday records on file");
        }
        else { // asks user for input to set price range.
            System.out.println("Enter price range lower limit: ");
            double lowerLimit = keyboardIn.nextDouble();
            System.out.println("Enter price range upper limit: ");
            double upperLimit = keyboardIn.nextDouble();

            // if price is in range then print to screen the holiday objects from the list.
            for (Holiday holidayRecord : listHoliday) {
                if (holidayRecord.getCost() >= lowerLimit && holidayRecord.getCost() <= upperLimit){
                    System.out.println(holidayRecord);
                }
                
                
            }  
        }

    }// close range method


    public static void viewHolidaysCheapest(List<Holiday> listHoliday, Scanner keyboardIn) {
        if (listHoliday.isEmpty()) {  // check if list and therefore file is empty
            System.out.println("No holiday records on file");
        }
        else { 
            
            Holiday cheapestHoliday = listHoliday.get(0); // we assign the first holiday on file and the compare against the others


            // if price of holiday object is higher then current cheapest variable then assign it.
            for (Holiday holidayRecord : listHoliday) {
                if (holidayRecord.getCost() < cheapestHoliday.getCost()){
                    cheapestHoliday = holidayRecord;
                }
            }
            System.out.println("This is the cheapest holiday on File");

            // prints the Holiday object assigned to cheapestHoliday.
            System.out.println(cheapestHoliday.toString());
                
              
            
        }

    }// close cheapest method

    public static void removeHoliday() {
        System.out.println("bob");
    }

}//close class
