/*Practical 7B - Question 3
Author: Clare Doherty
Design and implement a Circle class  */

public class Circle
{
   //declare instance variables
   private double radius;
   private final double PI = 3.14; //make PI constant
   
   //Define default constructor
   public Circle()
   {
      radius = 0.0;
   }
   
   //Methods
   public void setRadius(double r) throws IllegalArgumentException 
   {
      if(r >= 0)
      {
         radius = r;
      }
      else
      {
         throw new IllegalArgumentException("Radius cannot be negative");
      }
      
   }
   
   public double getRadius()
   {
      return radius;
   }
   
   public double area()
   {
      return PI * radius * radius;
   }
   
   public double circumference()
   {
      return 2 * PI * radius;
   }
}//end class