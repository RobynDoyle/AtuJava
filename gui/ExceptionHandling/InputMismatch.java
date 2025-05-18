import java.util.*;
public class InputMismatch
{
   public static void main(String args[])
   {
      Scanner keyboardIn = new Scanner(System.in);
      int num;
      try
      {
            System.out.print("Enter an integer:");
            num = keyboardIn.nextInt();
            System.out.println("The number entered was "+num);
           
      }
      catch(InputMismatchException ex)
      {
            System.out.println("Error - You can only enter Integer values");
      }
      
   }//close main method
}//close class