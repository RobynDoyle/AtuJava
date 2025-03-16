package week4;
import java.util.Scanner;

public class Grade {

    public static void main(String[] args){
        Scanner keyboardIn = new Scanner(System.in);
        
        double gradeInput;
        double totalGradeBucket = 0;
        int numberOfStudents = 3;
        int counter = 0;

        while (counter < numberOfStudents){
            counter++;
            gradeInput = 101;
            

            while (gradeInput < 0 || gradeInput > 100) {
                System.out.print("Enter grade in range 0 to 100 for Student " + counter + " : ");
                gradeInput = keyboardIn.nextDouble();
            }
            totalGradeBucket = gradeInput + totalGradeBucket;
            
            
        }
        System.out.println(totalGradeBucket);

        double averageGrade = totalGradeBucket / numberOfStudents;

        System.out.println("The average grade was " + averageGrade);
        




        keyboardIn.close();
    }
    
}
