package week4;
import java.time.LocalDate;
import java.util.Scanner;

public class Ramdate {
    public static void main(String[] args){

        Scanner keyboardIn = new Scanner(System.in);

        LocalDate ramadam2025 = LocalDate.of(2025, 02, 28);

        System.out.print("Enter how many years into future you want to know Ramadam Date: ");
        int yearsFuture = keyboardIn.nextInt();
        int subtractedDays = yearsFuture * 11;
       
       
       
        LocalDate futureRamadam = ramadam2025.plusYears(yearsFuture).minusDays(subtractedDays);

        System.out.println("Ramadam starts on " + futureRamadam + " which is in " + yearsFuture + " years.");

        keyboardIn.close();





    }
    
}
