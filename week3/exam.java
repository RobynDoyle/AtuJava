package week3;
import java.util.Scanner;

public class exam {
    public static void main(String[] args){
        Scanner keyboardIn = new Scanner(System.in);
        System.out.print("Please enter your grade: ");
        int exam_grade = keyboardIn.nextInt();



        if (exam_grade > 40 && exam_grade < 101){
            System.out.println("Congrats you passed");
        }

        keyboardIn.close();
        
    }

}