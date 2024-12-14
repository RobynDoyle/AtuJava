package week2;

import java.util.Scanner;

public class Tax {
    public static void main(String[] args){
        Scanner keyboardIn = new Scanner(System.in);

        double rate = 15;
        double hours = keyboardIn.nextDouble();

        double beforeTax = rate * hours;
        double afterTax = beforeTax * 0.6;
         


    }
    
}
