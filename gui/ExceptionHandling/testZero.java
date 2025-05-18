package gui.ExceptionHandling;

import java.util.InputMismatchException;

public class testZero {
    public static void main(String[] args) {
        int number1 = 2;
        int number2 = fdsf;

        try {
            int result = number1 / number2;
            System.out.println("Result is " + result);
        } catch (InputMismatchException e) {
            System.out.println("Numbers have an error.");
            // TODO: handle exception
        }
    }
    
}
