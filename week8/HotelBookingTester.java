package week8;
import java.util.Scanner;

public class HotelBookingTester {
    
    public static void main(String[] args){
        Scanner keyboardIn = new Scanner(System.in);
        HotelBooking booking1 = new HotelBooking(2220,"Family Room",55, 3);
        HotelBooking booking2 = new HotelBooking(1001,"Big Family Room",150, 7);
        int systemInput = 1;

        do {
            System.out.println("Choose booking");
            int booking = keyboardIn.nextInt();


            System.out.println("1 = View room type");
            System.out.println("2 = View all Booking Details");
            System.out.println("3 = Change Number of Nights");
            System.out.println("4 = View Price Per Night");
            System.out.println("5 = View Total Price");
            System.out.println("0 = Exit");




            System.out.println("Choose a menu option");
            systemInput = keyboardIn.nextInt();

            if (booking == 1){
                switch (systemInput) {
                    case 1:
                        System.out.println(booking1.getRoomType());
                        break;
                    case 2:
                        System.out.println(booking1.toString());
                        break;
                    case 3:
                        System.out.println(booking1.setNumberOfNights(booking););
                        break;
                    case 4:
                        System.out.println(booking1.pricePerNight());
                        break;    
                    default:
                        System.out.println("Invalid day");
            }

            

        } while (systemInput != 0)  

        keyboardIn.close();


    }
}
