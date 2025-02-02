package week5;
import java.util.Scanner;

public class Array {
    
    public static void main(String[] args) {

        Scanner keyboardIn = new Scanner(System.in);
        
        int[] times = new int[5];
        int total = 0;

        for (int i = 0; i < times.length; i++){
            System.out.print("Input value " + (i + 1) + ": ");
            times[i] = keyboardIn.nextInt();
        }

        System.out.println("*************************");

        for (int j = 0; j < times.length; j++){
            System.out.println(times[j]);
            total = total + times[j];
        }

        //times[0] = 4;

        System.out.println(total + " <-");

        keyboardIn.close();

        


        
    }
}
