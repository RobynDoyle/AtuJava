package java2.InOut;

import java.io.*;

import java.util.Scanner;

public class FileReader {
    
public static void main(String[] args) throws IOException {

    File readfile = new File("FileName.txt");
    Scanner input = new Scanner(readfile);

    while(input.hasNext()){
        //read data
        String testing = input.next();
        String monarch = input.next();
        String emir = input.next();
        System.out.println(testing + " " + monarch + " " + emir);

    } // closes while loop

    input.close();


} // closes main
    
} // closes class
