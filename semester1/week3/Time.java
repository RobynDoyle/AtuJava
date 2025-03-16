package week3;
import java.util.Scanner;

public class Time {
    public static void main(String[] args){
        Scanner keyboardIn = new Scanner(System.in);

        System.out.print("What time is it?: ");
        int hour = keyboardIn.nextInt();

        if (hour >= 0 && hour <= 11){
            System.out.println("Good morning");
        }
        else if (hour >= 12 && hour <= 17){
            System.out.println("Good afternoon");
        }
        else if (hour >= 18 && hour <= 23){
            System.out.println("Goodnight");
        }
        else {
            System.out.println("Out of range");
        }


        keyboardIn.close();
    }
    
}
