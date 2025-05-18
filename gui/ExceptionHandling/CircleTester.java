/*Practical 7B - Question 3
Author: Clare Doherty
Tester program for Circle class */

import java.util.*;

public class CircleTester
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      //create object of the class 
      Circle c1 = new Circle();
      double radius;
      try
      {
         System.out.print("Enter radius for circle:");
         radius = keyboardIn.nextDouble();
         //Pass this value to the setRadius method
         c1.setRadius(radius);
         // get and print details of the circle
         System.out.println("Radius " + c1.getRadius());
         System.out.println("Area " + c1.area());
         System.out.println("Circumference " + c1.circumference());
      }
      catch(IllegalArgumentException ex)
      {
         System.out.println(ex);
      }
   }
}