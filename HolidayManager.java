import java.io.*;
import java.util.Scanner;

public class HolidayManager {
    public static void main(String[] args) throws IOException
    {
        // Initialise input variables.
        String destinationIn, deptAirportIn;
        int durationIn; 
        double costIn;
        char ans;

        Scanner keyboardIn = new Scanner(System.in); // set up scanner instance for user input.
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

      } while(ans == 'y' || ans == 'Y');  //continue entering holidays
        
        

        holidayFile.close(); // close the File Writer.
        keyboardIn.close(); // close the scanner instance.
        System.out.println("File created and saved");

    }// close main method
}//close class
