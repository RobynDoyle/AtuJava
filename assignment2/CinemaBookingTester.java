package assignment2;
import java.util.Scanner;

class CinemaBooking {
    private int bookingID;
    private String movieTitle;
    private String showTime;
    private int numTickets;
    private double pricePerTicket;

    // Default constructor
    public CinemaBooking() {
        this.numTickets = 1; // Default to 1 ticket
    }

    // Constructor with required fields
    public CinemaBooking(int bookingID, String movieTitle, String showTime, double pricePerTicket) {
        this.bookingID = bookingID;
        this.movieTitle = movieTitle;
        this.showTime = showTime;
        this.pricePerTicket = pricePerTicket;
        this.numTickets = 1; // Default to 1 ticket
    }

    // Constructor with all fields
    public CinemaBooking(int bookingID, String movieTitle, String showTime, int numTickets, double pricePerTicket) {
        this.bookingID = bookingID;
        this.movieTitle = movieTitle;
        this.showTime = showTime;
        this.numTickets = numTickets;
        this.pricePerTicket = pricePerTicket;
    }

    // Getters
    public String getMovieTitle() {
        return movieTitle;
    }

    public String getShowTime() {
        return showTime;
    }

    // Setters
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public void setNumTickets(int numTickets) {
        this.numTickets = numTickets;
    }

    // Calculate total price
    public double calculateTotalPrice() {
        return numTickets * pricePerTicket;
    }

    @Override
    public String toString() {
        return "Booking ID: " + bookingID + "\nMovie: " + movieTitle + "\nShow Time: " + showTime + "\nTickets: " + numTickets + "\nPrice per Ticket: €" + pricePerTicket;
    }
}

public class CinemaBookingTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating two bookings
        CinemaBooking booking1 = new CinemaBooking(1234, "Avengers: Endgame", "7:00 PM", 2, 10.50);
        CinemaBooking booking2 = new CinemaBooking(5678, "Inception", "9:30 PM", 1, 8.00);

        CinemaBooking selectedBooking = booking1;

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. View Movie Title");
            System.out.println("2. View Show Time");
            System.out.println("3. View all Booking Details");
            System.out.println("4. Change Number of Tickets");
            System.out.println("5. View Price Per Ticket");
            System.out.println("6. View Total Price");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Movie Title: " + selectedBooking.getMovieTitle());
                    break;
                case 2:
                    System.out.println("Show Time: " + selectedBooking.getShowTime());
                    break;
                case 3:
                    System.out.println(selectedBooking);
                    break;
                case 4:
                    System.out.print("Enter new number of tickets: ");
                    int newTickets = scanner.nextInt();
                    selectedBooking.setNumTickets(newTickets);
                    System.out.println("Number of tickets updated.");
                    break;
                case 5:
                    System.out.println("Price per Ticket: €" + selectedBooking.calculateTotalPrice() / selectedBooking.numTickets);
                    break;
                case 6:
                    System.out.println("Total Price: €" + selectedBooking.calculateTotalPrice());
                    break;
                case 0:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}