package week2;
import java.util.Scanner;

public class Pi {

    public static void main(String[] args){

    Scanner keyboardIn = new Scanner(System.in);
    final double  Pi = 3.142;

    System.out.print("Enter the radius: ");
    double R = keyboardIn.nextDouble();
    double Area = Pi * R * R;
    System.out.println("Area is equal to " + Area + "cm2");
    keyboardIn.close();

    }


    
}
