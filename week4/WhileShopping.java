package week4;
import java.util.Scanner;


public class WhileShopping {

    public static void main(String[] args){
        Scanner keyboardIn = new Scanner(System.in);

        System.out.print("How many items will you buy today?: ");
        int itemsOnList = keyboardIn.nextInt();
        int itemsInBasket = 0;

        while (itemsOnList > 0){
            itemsInBasket+=1; 
            System.out.println("Item added to basket. Basket contains " + itemsInBasket + " Items.");
            itemsOnList-=1; 
            
        }

        keyboardIn.close();
    }
    
}
