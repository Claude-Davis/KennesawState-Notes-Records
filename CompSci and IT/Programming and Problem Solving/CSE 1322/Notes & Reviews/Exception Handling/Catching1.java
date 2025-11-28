/* 
   KEYWORDS:   Try, Catch, Finally
    -Try: the action that you are attempting to do/complete.
    -Catch: identify the issue that is preventing you from completing the action.
    -Finally: closing the file

    EXCEPTION HANDLING is the process of dealing with "exceptions" or potential problems that occur during a program's execution.
        - increases security of the program.

*/

import java.util.Scanner;

class Catching1{
    final static int max_size=5;
    static int numArray[]=new int[max_size];
    static int current_entries;

    public static double average_array(){
        int sum = 0;
        double ans_to_return;
        
        for (int i=0; i<current_entries; i++){
            sum+=numArray[i];
        }
        ans_to_return=sum/current_entries;
        return ans_to_return;
    }

    public static void readNumber() {
        Scanner scan = new Scanner(System.in);
        int input_number=0;
        int x=0;

        while (input_number != -1){
            System.out.println("Enter a number. (Enter -1 to quit): ");
            input_number= scan.nextInt();
            if (input_number != -1){
                numArray[x] = input_number;
                x++;
                current_entries++;
            }
        }
    }

            // MAIN 
    public static void main (String[] args){
        readNumber();
        double theAvg = average_array();
        System.out.println("Average of numbers is " + theAvg);
    }
}       /* This code works well, BUT if the user quits (enters -1) immediately, the program crashes and displays an exception message:
            "Expection in thread "main" java.lang.ArithmeticException: / by zero
                at Catching.average_array(Catching.java:26)
                at Catching.main(Catching.java:49)"

            - In this case, the for loop in avaerage_array() does nothing, because no numbers were entered
                - the issue primarily occurs at line 26: ans_to_return=sum/current_entries;
                - the sum is 0, and current_entries is also 0; the code crashed because of the error of 0 in the denominator
        */