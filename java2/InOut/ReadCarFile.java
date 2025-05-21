package java2.InOut;
import java.io.*;
import java.util.Scanner;

public class ReadCarFile {
    public static void main(String[] args) throws IOException
    {
        File readCarFile = new File("/Users/robyn/Desktop/ROYLE/ROYLE etc/UNI/ATU/Course 24/Done/Java - Software Development/AtuJava/java2/InOut/cars.txt");
        
        Scanner input = new Scanner(readCarFile);

        while(input.hasNext()){
            String reg = input.next();
            String make = input.next();
            String model = input.next();
            double value = input.nextDouble();
            System.out.println(reg + " " + make + " " + model + " " + value);
            
        }
        input.close();
    }
    
}
