package week4;
import java.util.Scanner;

public class SentinelGrade {

    public static void main(String[] args){
        Scanner keyboardIn = new Scanner(System.in);
        
        double gradeInput;
        double totalGradeBucket = 0;
        int counter = 0;

       
        outer:
        while (true) {

            System.out.print("Enter grade in range 0 to 100 for Student " + (counter+1) + " : ");
            gradeInput = keyboardIn.nextDouble();

            if (gradeInput == -1){
                break outer;
            }

            while (gradeInput < 0 || gradeInput > 100) {
            System.out.print("Enter grade in range 0 to 100 for Student " + (counter+1) + " : ");
            gradeInput = keyboardIn.nextDouble();
            if (gradeInput == -1){
                break outer;
            }
            }
            
            counter++;
            totalGradeBucket = gradeInput + totalGradeBucket;
            
            
        }
        System.out.println(totalGradeBucket);

        double averageGrade = totalGradeBucket / counter;

        System.out.println("The average grade was " + averageGrade + " for " + counter + " students!");
        




        keyboardIn.close();
    }
    
}
