package week4;
import java.util.Scanner;

public class Moon {
    public static void main(String[] args){
        System.out.print("The number of years that I wish to calculate moons for is: ");
        Scanner keyboardIn = new Scanner(System.in);
        double years = keyboardIn.nextDouble();
        double total_moons = years * 12.37;
        
        System.out.println("Total moons in " + years + " years was " + total_moons);
        keyboardIn.close();


    }
    
}
