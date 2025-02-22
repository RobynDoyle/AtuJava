/**
 * Author: Robyn Doyle 
 * Date: February 22, 2025
 * Description: This Cinema Booking Class defines variables, constructors and methods for a Cinema Booking system.
 */

public class CinemaBooking {

    // Instance variables
    private int bookingID;
    private String movieTitle;
    private String showTime;
    private int numTickets;
    private double pricePerTicket;

    // Constructors

    // Default setup with no info and empty values
    public CinemaBooking(){
        bookingID = 0;
        movieTitle = "";
        showTime = "";
        numTickets = 0;
        pricePerTicket = 0.0;
    }

    // Constructor with some info
    public CinemaBooking(int ID, String title, String time, double price){
        bookingID = ID;
        movieTitle = title;
        showTime = time;
        numTickets = 1;
        pricePerTicket = price;
    }

    // Constructor with all infos
    public CinemaBooking(int ID, String title, String time, int ticket, double price){
        bookingID = ID;
        movieTitle = title;
        showTime = time;
        numTickets = ticket;
        pricePerTicket = price;
    }

    // methods

    // gets the title of the movie
    public String getMovieTitle(){
        return movieTitle;
    }

    // gets the time when the movie runs
    public String getShowTime(){
        return showTime;
    }

    // gets number of tickets (specally added for option 5 in switch in Tester)
    public int getNumberTickets(){
        return numTickets;
    }

    // sets the Movie Title
    public void setMovieTitle(String newMovieTitle){
        movieTitle = newMovieTitle;
    }

    // sets Show time for the movie
    public void setShowTime(String setTime){
        showTime = setTime;
    }

    // sets number of tickets to be bought
    public void setNumTickets(int newNumTickets){
        numTickets = newNumTickets;
    }

    // calculates and returns the total price of the purchase
    public double calculateTotalPrice(){
        return numTickets * pricePerTicket;
    }

    public String toString(){
        return "Booking ID is: " + bookingID + "\nThe Movie is: " + movieTitle + "\nThe Show Time is: " + showTime + "\nNumber of Tickets is: " + numTickets + "\nThe Price per Ticket is: €" + pricePerTicket;
    }
}
