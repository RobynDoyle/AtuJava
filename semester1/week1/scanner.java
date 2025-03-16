import java.util.*;

public class scanner {
    public static void main(String[] args) {
        Scanner keyboardIn = new Scanner(System.in);

        int num1;

        System.out.print("Enter your number: ");
        num1 = keyboardIn.nextInt();

        System.out.println(num1);
        System.out.println();
        char c; 
        c = keyboardIn.next().charAt(0);
        System.out.println(c);

        keyboardIn.nextLine();

        System.out.println("Add name: ");
        String firstName = keyboardIn.nextLine();
        System.out.println(firstName + " is your driver");
        keyboardIn.close();
    }
    
}
