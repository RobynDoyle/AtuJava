package semester1.book;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        Scanner keyboardIn = new Scanner(System.in);

        System.out.print("Enter your weight in kg: ");
        double weight = keyboardIn.nextDouble();
        System.out.print("Enter your height in metres: ");
        double height = keyboardIn.nextDouble();

        double BMI = weight / (height * height);

        System.out.println("Your BMI is: " + BMI);

        keyboardIn.close();
    }
}
