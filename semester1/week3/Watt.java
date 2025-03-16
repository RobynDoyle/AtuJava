package week3;
import java.util.Scanner;

public class Watt {

    public static void main(String[] args){
        Scanner keyboardIn = new Scanner(System.in);

        System.out.print("Please enter Wattage to see the life expectancy of the bulb: ");
        int watt = keyboardIn.nextInt();

        switch(watt){
            case 25 : System.out.println("2500 hours");
            break;
            case 40 : case 60 : System.out.println("1000 hours");
            break;
            case 75 : case 100 : System.out.println("750 hours");
            break;
            default: System.out.println("0");
        }

        keyboardIn.close();

    }

}