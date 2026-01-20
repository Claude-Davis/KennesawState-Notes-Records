
import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> user_inputs = new ArrayList<>();
        
        Boolean run = true;
        String previous_line_tracker = "";


        //request user input
        System.out.println("Input a series of numbers to find their average.");
        System.out.println("After you input a number, press the 'Enter' key to insert the next number.\nInsert a '0'  or 'null' when done.");



        while (run) {
            String program_counter = sc.nextLine();
            Double verified_num = 0.0;

            
            try {
                verified_num = Double.parseDouble(program_counter);

                if (verified_num == 0) {                    //end this section of program when input is a zero
                    run = false;
                } else {
                    user_inputs.add(verified_num);          //add verified input to arraylist
                    previous_line_tracker = program_counter;
                    //System.out.println(user_inputs);                                                //line to verify input is being saved to arraylist
                    
                }
            } catch (NumberFormatException e) {
                if (program_counter == "") {
                    //System.out.println(previous_line_tracker + "PLT");                              //line to check current value of previous_line tracker
                    if (previous_line_tracker != "") {
                        run = false;
                    } else {
                        System.out.println("Cannot divide by zero. Provide input.");
                        System.exit(0);
                    }
                } else {
                    System.out.println("Your input is not a number.");
                    System.exit(0);
                }
                
            }
        }

        //calculate the sum
        FindAvg avg = new FindAvg(user_inputs);

        Double sum_total = avg.calculateTotal(user_inputs);
        //System.out.println(avg.getSum());                                                             //line to verify sum is being calculated 

        //calculate the average
        Integer denominator = avg.findDenominator(user_inputs);
        //System.out.println(avg.getDenom());                                                           //ine to verify denominator is calculated

        Double final_average = avg.calculateAverage(sum_total, denominator);
        System.out.print(avg.getAvg());         //final output
    }
}


