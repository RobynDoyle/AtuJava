package week3;
import java.util.Scanner;

public class Books {
    public static void main(String[] args){
        Scanner keyboardIn = new Scanner(System.in);
        System.out.print("PLease enter price of book 1: ");
        double book1price = keyboardIn.nextDouble();
        System.out.print("PLease enter price of book 2: ");
        double book2price = keyboardIn.nextDouble();
        System.out.print("PLease enter price of book 3: ");
        double book3price = keyboardIn.nextDouble();
        keyboardIn.close();

        double totalPrice = book1price + book2price + book3price;
        double possibleDiscount = totalPrice * .1;

        if (totalPrice > 50.0) {
            totalPrice = totalPrice - possibleDiscount;
        }
        
        System.out.println("Total Price is " + totalPrice);
    }
    
}
