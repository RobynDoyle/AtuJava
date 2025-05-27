/*Class representing a Holiday 
Author: Clare Doherty
Student: Robyn Doyle
Student Number: L00188328 */

public class Holiday
{
   //instance variables
   private int holidayNo;
   private String destination;
   private String deptAirport;
   private int duration;
   private double cost;
   
   private static int nextHolidayNo = 1;
   
   //Constructors
   //Constructor 1 - Default
   public Holiday()
   {
      holidayNo = nextHolidayNo++;
      destination = "";
      deptAirport = "";
      duration = 0;
      cost = 0.00;
   }
   
   //Constructor 2 - User defined
   public Holiday(String destinationIn, String deptAirportIn, int durationIn, double costIn)
   {
      holidayNo = nextHolidayNo++;
      destination = destinationIn;
      deptAirport = deptAirportIn;
      duration = durationIn;
      cost = costIn;
   }
   
   //Constructor 3 - For reading lines from FIle and replicating the holiday objects with ID.
   public Holiday(int IDIn, String destinationIn, String deptAirportIn, int durationIn, double costIn)
   {
      holidayNo = IDIn; // this ID passing could lead to having the duplicate ID's present if the file is manipulated or set up wrong. 
      //But it is necesary to get the correct ID associated to the holiday record. 
      //We will assume the file is set up correctly.
      destination = destinationIn;
      deptAirport = deptAirportIn;
      duration = durationIn;
      cost = costIn;
   }
   
   
   //Mutator methods
   public void setDestination(String destinationIn)
   {
      destination = destinationIn;
   }
   public void setDepartureAirport(String deptAirportIn)
   {
      deptAirport = deptAirportIn;
   }
   public void setDuration(int durationIn)
   {
      duration = durationIn;
   }
   public void setCost(double costIn)
   {
      cost = costIn;
   }
   
   //Accessor methods
   public int getHolidayNo()
   {
      return holidayNo;
   }
   public String getDestination()
   {
      return destination;
   }
   public String getDepartureAirport()
   {
      return deptAirport;
   }
   public int getDuration()
   {
      return duration;
   }
   public double getCost()
   {
      return cost;
   }
   
   //toString method
   public String toString()
   {
      return "Holiday No: " +holidayNo+ 
             "\t Destination: "+destination+
             "\t Departure Airport: "+deptAirport+
             "\t Duration: "+duration+
             "\t Cost: " +cost;
   }


}//close Holiday class
