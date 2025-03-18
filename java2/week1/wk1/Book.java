package java2.week1.wk1;
/* Book Class
Author: Clare Doherty
Class to demonstrate the use of Constructor overloading */

public class Book
{
   //declare instance variables
   private int isbn;
   private String title;
   private String author;
   int year;
   
   //Constructors
   //1st constructor sets all instance variables to default values
   public Book()
   {
      isbn = 0;
      title = "";
      author = "";
      year = 0;
   }
   
   //2nd constructor takes input to set the isbn, title and the author. Year is still set as default
   public Book(int n, String t, String a)
   {
      isbn = n;
      title = t;
      author = a;
      year = 0;
   }
   
   //3rd constructor takes input to set all the instance variables
   public Book(int n, String t, String a, int yr)
   {
      isbn = n;
      title = t;
      author = a;
      year = yr;
   }
   
   //Mutator (Set)Methods
   
   public void setIsbn(int num)
   {
      isbn = num;
   }
   public void setTitle(String t)
   {
      title = t;
   }
   public void setAuthor(String a)
   {
      author = a;
   }
   public void setYear(int yr)
   {
      year = yr;
   }
   
   //Accessor (Get) methods
   public int getIsbn()
   {
      return isbn;
   }
   
   public String getTitle()
   {
      return title;
   }
   
   public String getAuthor()
   {
      return author;
   }
   
   public int getYear()
   {
      return year;
   }
   public String toString()
   {
      return "Book Title :"+ title + "\t Author: "+author+ " \tYear Published :"+year;
   }
}//close class