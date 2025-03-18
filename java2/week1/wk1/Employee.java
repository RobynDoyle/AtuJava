/*Employee Class
Author: Clare Doherty */

public class Employee
{
   //instance variables
   private int empNo;
   private String empName;
   private String jobTitle;
   private double salary;
   private static int nextEmpNo = 100;
   
   //constructors
   public Employee()
   {
      empNo = 0;
      empName = " ";
      jobTitle = " ";
      salary = 0.0;
   }
   
   public Employee(String name, double sal)
   {
      empNo = nextEmpNo++;
      empName = name;
      salary = sal;
      jobTitle = " ";
   }
   
   public Employee(String name, double sal, String title)
   {
      empNo = nextEmpNo++;
      empName = name;
      salary = sal;
      jobTitle = title;
   }
   //methods
   
   //Accessor methods
   
   public int getEmpNum()
   {
      return empNo;
   }
   
   public String getEmpName()
   {  
      return empName;
   }
   
   public double getSalary()
   {
      return salary;
   }
   
   public String getJob()
   {
      return jobTitle;
   }
    
   //Raise the salary
   public void raiseSal(double amount)
   {
      salary = salary + amount;
   }
   //Reduce salary
   public void reduceSal(double amount)
   {
      salary = salary - amount;
   }
   //Calculate monthly wage
   public double monthlyWage()
   {
      //demonstrate use of local variable
      double monthly = salary / 12;
      return monthly;
   }
   //Calculate percentage
   public double bonus(double percent)
   {
      return salary * percent;
   }
   

   public String toString()
   {
      return "Employee No: "+empNo+ "\tEmployee Name: "+empName+ "\tSalary: "+salary+ "\tJob Title: "+jobTitle;
   }
}//close class