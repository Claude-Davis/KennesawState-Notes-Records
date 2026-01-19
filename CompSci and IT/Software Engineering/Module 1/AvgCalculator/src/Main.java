
import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> user_inputs = new ArrayList<>();
        
        Boolean run = true;


        //request user input
        System.out.println("Input a series of numbers to find their average.");
        System.out.println("After you input a number, press the 'Enter' key to insert the next number.\nInsert a '0' when done.");

        //take in user input

        while (run) {
            String program_counter = sc.nextLine();
            Double user_num = 0.0;
            
            try {
                user_num = Double.parseDouble(program_counter);

                if (user_num == 0) {                    //end this section of program when input is a zero
                    break;
                } else {
                    user_inputs.add(user_num);          //add verified input to arraylist
                    System.out.println(user_inputs);
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Your input is not a number.");
                break;
            }
           
        }
    }
}
