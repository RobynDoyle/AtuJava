/*Author: Clare Doherty
Program to demonstrate 2 types of Exceptions */

import java.util.*;

public class DivideInputDemo
{
   public static void main(String args[])
   {
      Scanner keyboardIn = new Scanner(System.in);
      //declare variables
      int number1, number2, result;
      //Assign values
      try
      {
         System.out.print("Please enter number 1:");
         number1 = keyboardIn.nextInt();
         System.out.print("Please enter number 2:");
         number2 = keyboardIn.nextInt();
         result = number1 / number2;
         System.out.print("The result of the 2 numbers divided is " +result);   
      }
      catch(ArithmeticException ex)
      {
         System.out.println("Exception: An Integer value cannot be divided by 0");
      }
      catch(InputMismatchException ex)
      {
         System.out.println("Error: You must enter Integer values only");
      }
      
   }
}
