import java.util.Scanner;
import java.io.*;  //imports everything from java.io package

class Driver{
    public static void main (String[] args) throws FileNotFoundException {
        try {
            File file = new File ("C:\\Users\\claud\\Downloads\\GradingSystem\\Grades.txt"); 
            Scanner scan = new Scanner(file);
    
            String line = "";
            int lineNum = 0;

            while (scan.hasNextLine()) {
                line = scan.nextLine();
                lineNum++;

                System.out.println("Line #" + lineNum + " says '" + line + ".'\n");
            }

            System.out.println("- - - - -");
            System.out.println("Program Done");
        } catch (FileNotFoundException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}