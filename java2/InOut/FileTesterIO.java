package java2.InOut;
import java.io.*;

public class FileTesterIO {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("FileName.txt"); // corrected extension
            PrintWriter pw = new PrintWriter(fw);

            pw.println("TESTING IS SULTAN");
            pw.println("TESTING IS KING");
            pw.println("TESTING IS EMIR");

            pw.close();
            fw.close();
            System.out.println("File success");
        }
        catch (IOException e){
            System.out.println("Error = " + e.getMessage());
        }
    }
    
}
