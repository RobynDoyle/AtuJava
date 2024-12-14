package week2;

import java.util.Scanner;

public class Tax {
    public static void main(String[] args){
        Scanner keyboardIn = new Scanner(System.in);

        double rate = 20;
        System.out.print("What is your name?: ");
        String name = keyboardIn.nextLine();
        System.out.print("How many hours do you work?: "); 
        double hours = keyboardIn.nextDouble();

        double beforeTax = rate * hours;
        double incomeTax = beforeTax * 0.4;
        double PRSI = beforeTax * 0.05;
        double USC = beforeTax * 0.02;
        double totatTax = incomeTax + PRSI + USC;
        double netPay = beforeTax - totatTax;
        double month = netPay * 4.5;

        System.out.println("************************************");
        System.out.println("\t\t"+ name);
        System.out.println("************************************");
        System.out.println("Hours: " + hours + "  Rate: " + rate + "  Gross Pay: " + beforeTax);
        System.out.println("Minus Taxes");
        System.out.println("Tax: " + incomeTax + " USC: " + USC + " PRSI: " + PRSI + " Total Tax: " + totatTax);
        System.out.println("Net Pay per week: " + netPay);
        System.out.println("Net pay per month: " + month);

        keyboardIn.close();


    }
    
}
