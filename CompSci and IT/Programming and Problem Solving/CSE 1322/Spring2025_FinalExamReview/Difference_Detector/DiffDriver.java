//package Difference_Detector;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DiffDriver {
    public static String diff(File file1, File file2) throws FileNotFoundException, NoSuchElementException{
        String line1 = "";
        String line2 = "";

        int lineNum = 0;

        String printThis = " ";

        try {
            Scanner forTest1 = new Scanner(file1);
            Scanner forTest2 = new Scanner(file2);

            while ((forTest1.hasNextLine()) || (forTest2.hasNextLine())) {
                line1 = forTest1.nextLine();
                line2 = forTest2.nextLine();

                lineNum++;

                //line differences
                if (!line1.equals(line2)){
                    printThis += "\nLine " + lineNum +": \n< " + line1 + "\n> " + line2;
                }
            }

            //line identical
            if (line1.equals(line2)) {   //can't use line1==line2 bcs it compares the objects not the content
                printThis = "\nFiles are identical.";
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NoSuchElementException e) {
            printThis = "\nFiles have different number of lines.";
        }

        
        return printThis;
    }

    public static void main(String[] args) throws FileNotFoundException{
        Scanner scan = new Scanner(System.in);
        System.out.println("[Diff Detector]");
        int opt = 0;

            System.out.print("Enter the name of file 1: ");
                String fileName1 = scan.nextLine();
            System.out.print("Enter the name of file 2: ");
                String fileName2 = scan.nextLine();

            File file1 = new File(fileName1);
            File file2 = new File(fileName2);

            System.out.println(diff(file1, file2));
    }
}
