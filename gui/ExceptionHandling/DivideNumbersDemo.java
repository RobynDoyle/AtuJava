/*Author: Clare Doherty
Program to demonstrate Arithmetic exception */

import java.util.*;

public class DivideNumbersDemo
{
   public static void main(String args[])
   {
      Scanner keyboardIn = new Scanner(System.in);
      //declare variables
      int number1, number2, result;
      //Assign values
      
      System.out.print("Please enter number 1:");
      number1 = keyboardIn.nextInt();
      System.out.print("Please enter number 2:");
      number2 = keyboardIn.nextInt();
      try
      {
         result = number1 / number2;
         System.out.print("The result of the 2 numbers divided is " +result);   
      }
      catch(ArithmeticException ex)
      {
         System.out.println("Exception: An Integer value cannot be divided by 0");
      }
   }
}
