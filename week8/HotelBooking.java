package week8;

public class HotelBooking {

    // instance vars
    private int roomNumber;
    private int numberOfNights;
    private String roomType;
    private double pricePerNight;

    // constructors

    public HotelBooking(int num, String type, double price){
        roomNumber = num;
        roomType = type;
        pricePerNight = price;
        numberOfNights = 1;
    }

    public HotelBooking(int num, String type, double price, int nights){
        roomNumber = num;
        roomType = type;
        pricePerNight = price;
        numberOfNights = nights;
    }

    // methods

    public String getRoomType(){
        return roomType;
    }

    public double getPricePerNight(){
        return pricePerNight;
    }

    public void setNumberOfNights(int nightsIn){
        numberOfNights = nightsIn;
    }

    public double calculateTotalCost(){
        return pricePerNight * numberOfNights; 
    }

    public String toString(){
        return "Room number: " + roomNumber + " Price for stay: " + calculateTotalCost() + " Length of stay: " + numberOfNights;
    }

    
    
}
