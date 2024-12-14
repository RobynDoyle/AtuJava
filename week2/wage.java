package week2;

import java.util.Scanner;

public class wage {

    public static void main(String[] args){
        
        Scanner keyboardIn = new Scanner(System.in);
        
        double wage = 15;
        System.out.print("Number of hours worked in a week?: ");
        double hours = keyboardIn.nextDouble();
        double salary = wage * hours;

         keyboardIn.close();

        

        System.out.println("Your total salary is = €" + salary);

    
    
    }
    
}
