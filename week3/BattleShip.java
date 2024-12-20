package week3;
import java.util.Scanner;

public class BattleShip {
    public static void main(String[] args){
        Scanner keyboardIn = new Scanner(System.in);
        System.out.print("Input Target: ");
        char target = keyboardIn.next().charAt(0);

        if (target == 'B' || target == 'b'){
            System.out.println("Battleship targeted");
        }
        else if (target == 't' || target == 'T'){
            System.out.println("Tank targeted");
        }
        else {
            System.out.println("No viable target selected");
        }

        switch(target)
        {
            case 't' : case 'T' : System.out.println("Tank hit!");
                            break;
            case 'b' : case 'B' : System.out.println("Battleship hit!");
            break;
            default: System.out.println("No hit");
        }
        keyboardIn.close();

    }
    
}
