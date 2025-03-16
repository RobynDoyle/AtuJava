package week8;

public class Book {

    //instace vars
    private String title;
    private String author;
    private int year;

    // constructor

    public Book(){
        year = 0;
        title = "";
        author = "";
    }

    public Book(int thisYear, String thisTitle, String thisAuthor){
        year = thisYear;
        title = thisTitle;
        author = thisAuthor;
    }

    public String getInfo(){

        String info = title + ": " + author + ": " + year;
        return info;
    }
    
}
