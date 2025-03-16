package semester1;
/**
 * Author: Robyn Doyle 
 * Date: February 22, 2025
 * Description: This Cinema Booking Class Tester is used to Test the Cinema Booking Class.
 */


import java.util.Scanner;

public class CinemaBookingTester{
    public static void main(String[] args){
        
        // create instance of the scanner for user input
        Scanner keyboardIn = new Scanner(System.in);

        CinemaBooking bookingEmpty = new CinemaBooking();
        CinemaBooking booking1 = new CinemaBooking(1234, "Avengers: Endgame", "7:00 PM", 2, 10.50);
        CinemaBooking booking2 = new CinemaBooking(5678, "Inception", "9:30 PM", 1, 8.00);

        // Chooses the booking to be looked at in the switch
        int bookingChoice = 0;

        while (bookingChoice != 1 && bookingChoice != 2 ){
            System.out.print("Which booking do you wish to view? \n 1 = booking1, 2 = booking2. Choice:");
            bookingChoice = keyboardIn.nextInt();
        }

        // Set up CinemaBooking with dummy for switch
        CinemaBooking chosenBooking = bookingEmpty;  
        
        // allocate which booking we will look at
        switch (bookingChoice){
            case 1: chosenBooking = booking1;
                break;
            case 2: chosenBooking = booking2;
                break;
        }

       

        while (true) {
            System.out.println("\nSelect an option to view booking" + bookingChoice + ":");
            System.out.println("1. View Movie Title");
            System.out.println("2. View Show Time");
            System.out.println("3. View all Booking Details");
            System.out.println("4. Change Number of Tickets");
            System.out.println("5. View Price Per Ticket");
            System.out.println("6. View Total Price");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int menuOption = keyboardIn.nextInt();

            switch (menuOption) {
                case 1:
                    System.out.println("Movie Title: " + chosenBooking.getMovieTitle());
                    break;
                case 2:
                    System.out.println("Show Time: " + chosenBooking.getShowTime());
                    break;
                case 3:
                    System.out.println(chosenBooking.toString());
                    break;
                case 4:
                    System.out.print("Enter new number of tickets: ");
                    int newNumTickets = keyboardIn.nextInt();
                    chosenBooking.setNumTickets(newNumTickets);
                    System.out.println("Number of tickets updated.");
                    break;
                case 5:
                    System.out.println("Price per Ticket: €" + chosenBooking.calculateTotalPrice() / chosenBooking.getNumberTickets());
                    break;
                case 6:
                    System.out.println("Total Price: €" + chosenBooking.calculateTotalPrice());
                    break;
                case 0:
                    System.out.println("Leaving...");
                    // close the scanner
                    keyboardIn.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } 

    }
}