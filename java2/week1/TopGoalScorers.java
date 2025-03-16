package java2.week1;
import java.util.ArrayList;

public class TopGoalScorers {
    public static void main(String[] args) {
        ArrayList <String> goalScorers = new ArrayList<>();
        String gsOne = "Mark";
        String gsTwo = "Bob";
        String gsThree = "Tom";


        goalScorers.add(gsOne);
        goalScorers.add(gsTwo);
        goalScorers.add(gsThree);

        
        for(int i = 0; i < goalScorers.size(); i++){
            System.out.println(goalScorers.get(i));
        }
    }
}
