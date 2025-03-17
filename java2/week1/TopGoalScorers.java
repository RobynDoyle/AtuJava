package java2.week1;
import java.util.ArrayList;
import java.util.Scanner;

public class TopGoalScorers {
    public static void main(String[] args) {
        Scanner keyboardIn = new Scanner(System.in);
        ArrayList <String> goalScorers = new ArrayList<>();
        String gsOne = "Mark";
        String gsTwo = "Bob";
        String gsThree = "Tom";

        int size = 5;

        for (int i = 0; i < size; i++){
            System.out.println("Enter the name of player " + (i + 1) + ": ");
            String playerName = keyboardIn.nextLine();
            goalScorers.add(playerName);
        }
        
        for(int i = 0; i < goalScorers.size(); i++){
            System.out.println(goalScorers.get(i));
        }
    }
}
