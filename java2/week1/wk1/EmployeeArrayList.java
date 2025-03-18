/*Create ArrayList of Employee Objects
Use menu based program to View, Add or Delete Employees
Author: Clare Doherty */

import java.util.*;

public class EmployeeArrayList
{
   public static void main(String args[])
   {
      Scanner keyboardIn = new Scanner(System.in);
      //Create ArrayList for Employee Objects
      ArrayList<Employee> empList = new ArrayList<>();
      
      //Declare any variables needed for program
      int choice;
      String eName, job;
      double salary;
    
      do
      {
         System.out.println("Main Menu");
         System.out.println("1. View all employees");
         System.out.println("2. Add an employee");
         System.out.println("3. Remove an employee");
         System.out.println("4. Get highest salary");
         System.out.println("0. Exit");
         System.out.print("Enter your choice: ");
         choice = keyboardIn.nextInt();
     }while(choice != 0);
   }
}