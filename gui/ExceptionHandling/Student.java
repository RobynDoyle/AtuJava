/*Class to demonstrate Student
Clare Doherty */

public class Student
{
   private int studentNo;
   private String studentName;
   private String courseName;
   
   public Student()
   {
      studentNo = 0;
      studentName = "";
      courseName = "";
   }
   public Student(int num, String name, String course) throws IllegalArgumentException
   {
      if(num < 0)
      {
         throw new IllegalArgumentException();
      }
      else
      {
         studentNo = num;
         studentName = name;
         courseName = course;
      }
   }
   
   public void setStudentNo(int num)
   {
      studentNo = num;
   }
   public void setStudentName(String name)
   {
      studentName = name;
   }
   public void setCourseName(String course)
   {
      courseName = course;
   }
   
   public int getStudentNo()
   {
      return studentNo;
   }
   public String getStudentName()
   {
      return studentName;
   }
   public String getCourseName()
   {
      return courseName;
   }
   
   public String toString()
   {
      return "Student Number: "+ studentNo+ " \t Student Name: "+studentName+
      "\t Course: "+courseName;
   }
}