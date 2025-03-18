package java2.week1.wk1;
import java.util.ArrayList;
import java.util.Scanner;

public class BookArrayList {
    public static void main(String[] args){
        ArrayList <Book> Books = new ArrayList<>();
        Scanner keyboardIn = new Scanner(System.in);

        Book BookOne = new Book(1423481093, "Bob Marley", "Tom Jones", 2006);
        Book BookTwo = new Book(999544333, "Mick", "Higgins T", 2026);
        
        Books.add(BookOne);
        Books.add(BookTwo);

        for(int i = 0; i < Books.size(); i++){
            System.out.println(Books.get(i));
        }

        

        while (true){

            System.out.println("Main Menu\n1. View all books\n2. Add a book\n3. Remove a book\nExit");
            System.out.print("Menu choice: ");
            int choice = keyboardIn.nextInt();

            switch (choice) {
                case 1:
                    for (Book book : Books) {
                        System.out.println(book);
                    }    
                    break;
                case 2: 
                    System.out.println("Add a book by entering its details.");
                    System.out.print("Isbn: ");
                    int ISBN = keyboardIn.nextInt();
                    keyboardIn.nextLine();
                    System.out.print("Title: ");
                    String title = keyboardIn.nextLine();
                    System.out.print("Author: ");
                    String author = keyboardIn.nextLine();
                    System.out.print("Year: ");
                    int year = keyboardIn.nextInt();
                    keyboardIn.nextLine();

                    Books.add(new Book(ISBN, title, author, year));
                    System.out.println("Book added");
                    break;
                case 3:
                    System.out.println("Enter an ISBN to remove the book: ");
                    int counterT = 0;
                    int bookToBeRemoved = -9;
                    int ISBNremove = keyboardIn.nextInt();
                    //
                    keyboardIn.nextLine();
                    
                    
                    //remove book where get isbn == isbnremove
                    for (Book book : Books){
                        if (ISBNremove == book.getIsbn()){                           
                            
                            bookToBeRemoved = counterT;  
                            break;
                        }
                        counterT++;          
                    }
                    if (bookToBeRemoved != -9){
                        Books.remove(bookToBeRemoved);
                    }
                    break;
                case 4:
                    return;


                default:
                    System.out.println("Invalid Choice");;
            }
        }
    }
    
}
