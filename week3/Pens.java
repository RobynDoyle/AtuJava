package week3;
import java.util.Scanner;

public class Pens {

    public static void main(String[] args){

        Scanner keyboardIn = new Scanner(System.in);
        System.out.println("Enter number of pens you wish to buy");
        double pen_price = .5;
        int pens_ordered = keyboardIn.nextInt();

        if (pens_ordered >= 30){
            pen_price = 0.3;
        }
        double checkout_total = pen_price * pens_ordered;
        System.out.println("Total cost is: " + checkout_total);
        keyboardIn.close();

    }
    
}
