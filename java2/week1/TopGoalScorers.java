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

        System.out.println("Do you wish to overwrite one of the names?: y/n");
        String choice = keyboardIn.nextLine();

        if(choice.equals("y")){
            System.out.println("Enter the position and then the name of the player");
            System.err.println("Position in array: ");
            int position = keyboardIn.nextInt();
            keyboardIn.nextLine(); // Consume newline
            System.out.println("New Name: ");
            String newName = keyboardIn.nextLine();

            goalScorers.set(position - 1, newName);

        }

        for(int i = 0; i < goalScorers.size(); i++){
            System.out.println(goalScorers.get(i));
        }

    }
}
