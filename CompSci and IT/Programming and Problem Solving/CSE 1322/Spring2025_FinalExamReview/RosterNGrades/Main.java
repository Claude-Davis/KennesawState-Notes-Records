import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.text.DecimalFormat;

public class Main {
    public static void main (String[] args) throws FileNotFoundException, NoSuchElementException{
        DecimalFormat df = new DecimalFormat(".00");

        System.out.println(" ");
        System.out.println("[Spring Class of 2025]");

        System.out.println(printNamesGrades());

        System.out.println(" ");
        System.out.println("Average of Grades: " + df.format(studentGradeAvg()));
    }

    public static String printNamesGrades() throws FileNotFoundException, NoSuchElementException{
        String studentsName = "";
        String grade = "";

        StringBuilder lines = new StringBuilder();

        try{
            File students = new File("StudentRoster.txt");
            File grades = new File("Grades.txt");

            Scanner readStudents = new Scanner(students);
            Scanner readGrades = new Scanner(grades);

            while (readStudents.hasNextLine()) {
                studentsName = readStudents.nextLine();
                grade = readGrades.nextLine();

                if (!(studentsName.trim()).equals("") && !(grade.trim()).equals("")) {
                    lines.append("\n" + studentsName +": " + grade);
                }

            }
            return lines.toString();
        } catch (FileNotFoundException e){
            System.out.println("ERROR: " + e.getMessage());
        } catch (NoSuchElementException e){
            System.out.println("ERROR: " + e.getMessage());
        }
        return lines.toString();
    }

    public static double studentGradeAvg() throws FileNotFoundException, NoSuchElementException{
        String gradeString = "";

        ArrayList<Integer> allGrades = new ArrayList<Integer>();

        double sumOfGrades = 0;

        double average = 0;

        try{
            File grades = new File("Grades.txt");

            Scanner readGrades = new Scanner(grades);

            while (readGrades.hasNextLine()) {
                gradeString = readGrades.nextLine();

                if (!(gradeString.trim()).equals("")){
                    int grade = Integer.parseInt(gradeString);
                    allGrades.add(grade);
                }

            }

            //grade avg calculations
            for (int g=0; g<allGrades.size(); g++){
                sumOfGrades += allGrades.get(g);
            }
            average = sumOfGrades / allGrades.size();

        } catch (FileNotFoundException e){
            System.out.println("ERROR: " + e.getMessage());
        } catch (NoSuchElementException e){
            System.out.println("ERROR: " + e.getMessage());
        }

        return average;
    }
}
