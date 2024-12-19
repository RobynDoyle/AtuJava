package week3;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        Scanner keyboardIn = new Scanner(System.in);

        System.out.println("What temp is it?: ");
        double temp = keyboardIn.nextDouble();

        if (temp < 0){
            System.out.println("Careful for ice!");
        }
        else {
            System.out.println("Safe to travel");
        }


        keyboardIn.close();
    }
    
}
