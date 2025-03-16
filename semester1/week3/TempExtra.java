package week3;
import java.util.Scanner;

public class TempExtra {

    public static void main(String[] args){
        Scanner keyboardIn = new Scanner(System.in);

        System.out.println("What is the temperature?: ");
        double temp = keyboardIn.nextDouble();

        if (temp < 0){
            System.out.println("Freezing");
        }
        else if (temp >= 0 && temp <= 6 ){
            System.out.println("Very Cold");
        }
        else if (temp >= 7 && temp <= 14){
            System.out.println("Warm");
        }
        else if (temp >= 15 && temp <= 21){
            System.out.println("Hot");
        }
        else {
            System.out.println("Very Hot");
        }

        keyboardIn.close();

    }
    
}
