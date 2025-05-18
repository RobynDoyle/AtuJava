/*Author: Clare Doherty
Program to divide 2 numbers */

import java.util.*;

public class DivideNumbers
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
      if(number2 == 0)
      {
         System.out.println("You cannot enter zero for number 2");
      }
      else
      {
         result = number1 / number2;
     
         System.out.print("The result of the 2 numbers divided is " +result);
      }
   
   }
}
   
   

