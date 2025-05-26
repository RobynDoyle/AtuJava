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
   
   //Constructor 3 - For reading lines from FIle and replicating the holiday objects.
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

   // this method allows us to convert the file data in a list of Holiday Objects. 
   public static Holiday makeString(String line) {
      String[] parts = line.split(","); // this splits the line using the comma as a delimiter   
      int ID = Integer.parseInt(parts[0].trim()); // parses the ID.  parsing for type int
      String destination = parts[1].trim();//  parsing for type string
      String deptAirport = parts[2].trim();
      int duration = Integer.parseInt(parts[3].trim()); // parsing for type int
      double cost = Double.parseDouble(parts[4].trim()); //parsing for type double
  
      return new Holiday(ID, destination, deptAirport, duration, cost); // sends the variables into the constuctor. 
  } // close makeString metho
}//close Holiday class
