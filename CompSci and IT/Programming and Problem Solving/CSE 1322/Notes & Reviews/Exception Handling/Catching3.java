import java.util.Scanner;

class Catching3{
    final static int max_size=5;
    static int numArray[]=new int[max_size];
    static int current_entries;

    public static double average_array(){
        int sum = 0;
        double ans_to_return;
        
        for (int i=0; i<current_entries; i++){
            sum+=numArray[i];
        }

        try { 
            ans_to_return=sum/current_entries;
        }
        catch(Exception zero){ 
            System.out.println("At least one input is required.");
            ans_to_return=0;

            //System.out.println(zero); //the contents of variable "zero" cn be printed (aka, the specific exception that is causing an issue)
        }

        return ans_to_return;
    }

    public static void readNumber() {
        Scanner scan = new Scanner(System.in);
        int input_number=0;
        int x=0;

        while (input_number != -1 ){
            System.out.println("Enter a number. (Enter -1 to quit): ");
            input_number= scan.nextInt();
            if (input_number != -1){

//UPDATED CODE
                try{
                numArray[x] = input_number;
                }
                catch(ArrayIndexOutOfBoundsException entries){   //"entries" is a variable of a specific type of exception
                    System.out.println("You can only enter 5 numbers.");
                    input_number= -1; //this line meets the quit function instead of taking in the user's extra input
                }
                x++;
                current_entries++;
//

            }
        }
    }

            // MAIN 
    public static void main (String[] args){
        readNumber();
        double theAvg = average_array();
        System.out.println("Average of numbers is " + theAvg);
    }
}