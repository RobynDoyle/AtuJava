package assignment2;
import java.util.Scanner;

public class testwhile {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        Integer bob = 1;


        do {
            System.out.println("Still here");
            bob = k.nextInt();
        }
        while (bob == 1);

        k.close();


        }
    }

