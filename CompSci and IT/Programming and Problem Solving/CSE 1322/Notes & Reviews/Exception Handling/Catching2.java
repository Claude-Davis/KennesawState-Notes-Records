import java.util.Scanner;

class Catching2{
    final static int max_size=5;
    static int numArray[]=new int[max_size];
    static int current_entries;

    public static double average_array(){
        int sum = 0;
        double ans_to_return;
        
        for (int i=0; i<current_entries; i++){
            sum+=numArray[i];
        }

//UPDATED CODE
        try {                                                               //This code will run USUALLY
        ans_to_return=sum/current_entries;
        }
        //If a problem occurs, then this code (lns 21-26) will run instead. (prevents the code from crashing)
        catch(Exception zero){    //"zero" is a variable name and is of type Exception. "zero" could be saved as any other word or letter
            System.out.println("At least one input is required.");//this output exlpains the issue to the user
            ans_to_return=0; //in case of an issue, this line still allows for ans_to_return to have a value to be displayed

            //System.out.println(zero); //the contents of variable "zero" cn be printed (aka, the specific exception that is causing an issue)
        }
//

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
}                           //This program allows the user to immediately input -1 without resulting in the program crashing. instead, the user is told the problem.

/* another potential issue occurs because of lines 4 and 5, at line 41: numArray[x] = input_number;.
    because the array size is set to 5, if the user inputs more than 5, the program crashes and this exception message is displayed: 

    "Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at Catching2.readNumber(Catching2.java:41)
        at Catching2.main(Catching2.java:50)"
*/