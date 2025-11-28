//modules 4 - 7 covered


import java.util.Scanner;
import java.util.Arrays;

public class Test2 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("[Review for Test 2]");
        int option = 0;
        
        while (option != 1){
            System.out.println("1. Quit");
            System.out.println("2. Recursions - Function Stack");
            System.out.println("3. Recursions - Factorial");
            System.out.println("4. Exceptions - Catch");
            System.out.println("5. Exceptions - Throw");
            System.out.println("6. Exceptions - Custom");

            System.out.println(" ");
            System.out.print("Enter Study Topic Choice: ");
            option = scan.nextInt();
            switch(option){
                case 2:                                                                                     // for Recursions_FunctionStack()
                    System.out.println("Recursions - Function Stack: ");

                    System.out.print("\tInput a Number: ");
                    int n = scan.nextInt();
                        System.out.println("\tThis method will continue until the difference is -1.");
                            System.out.println(" ");
                        Recursions_FunctionStack(n);

                        System.out.println("NOTES-");
                        System.out.println("\t Recursions work by causing the called method to call **itself** until a specific condition is met. Here, your input was used the call the method Recursions_FunctionStack(). The method substracted 1 from your input and used the resulting difference to call the method again. This loop continued until the difference equaled -1. (their is no return value.)");

                    System.out.println(" ");
                    System.out.println("-----");
                    System.out.println(" ");
                    break;
                case 3:                                                                                     // for Recursions_Factorial()
                    System.out.println("Recursions - Factorial");
                    System.out.print("\tEnter a Number to Factorialize: ");
                    int num = scan.nextInt();
                        int num0 = num;
                        System.out.println("\tThis method will continue until the difference to be multiplied is 0.");
                            System.out.println(" ");
                        System.out.println(num0 + "! = " + Recursions_Factorial(num));

                        System.out.println("NOTES-");
                        System.out.println("\t Recursions work by causing the called method to call **itself** until a specific condition is met. Here, your input was taken and used to call the method Recursions_Factorial(); the method returns 'num' times 'num'-1. The number 1 was subtracted from your input and the method was called again with this resulting difference. The method continued this loop until the difference equaled 0.");

                    System.out.println(" ");
                    System.out.println("-----");
                    System.out.println(" ");
                    break;
                case 4:                                                                                         // for Exceptions_Catch()
                    System.out.println("Exceptions - Catch");
                        System.out.print("\tCreate an Array: ");
                            int size = scan.nextInt();
                            Exceptions_Catch(size);

                    System.out.println(" ");
                    System.out.println("-----");
                    System.out.println(" ");
                    break;
                case 5:                                                                                         // Exceptions_Throw()
                    System.out.println("Exceptions - Throw");

                    System.out.println(" ");
                    System.out.println("-----");
                    System.out.println(" ");
                    break;
                case 6:                                                                                         //for Exceptions_Custom()
                    System.out.println("Exceptions - Custom");
                    
                    System.out.println(" ");
                    System.out.println("-----");
                    System.out.println(" ");
                    break;
            }
        }
        System.out.println("Bye!");
    }

    public static void Recursions_FunctionStack(int n){
            //base
            if (n == -1){
                return;
            }

            System.out.println("method(" + n + ")");

            //recursive call
            System.out.println("\t" + n + " - 1 = " + (n-1));
            Recursions_FunctionStack(n-1);
    }
    public static int Recursions_Factorial(int num){
        if (num==0){
            return 1;
        }

        System.out.println("number: " + num); //each number printed here is multiplied together to get the factorial
        System.out.println("\t(" + num + "-1) = " + (num-1));
        return num * Recursions_Factorial(num-1);
    }


    public static void Exceptions_Catch(int size){
        Scanner scan = new Scanner(System.in);

        int userArray[] = new int[size];
        System.out.println("Add Numbers to Your Array: ");
            int nums = 1;
        while (nums!=0){
            if (nums!=0){
                try {    
                nums = scan.nextInt();
                userArray[size] = nums;
                int difference = userArray[0];
                
                for (int n=0; n<= userArray.length; n++){
                    //create the subtraction equation
                    String equation = (userArray[n] + " - ");
                    equation.substring(0,(equation.length()-3));

                    //find the difference of the array
                    difference -= userArray[n+1];

                    //print the equation and answer
                    System.out.print(equation + " = " + difference);
                }
                

                } catch (Exception invalid){
                    System.out.println("You can only have " + size + " numbers in your array.");
                }
            }
        }
    }
    public static void Exceptions_Throw(){
        //
    }
    public static void Exceptions_Custom(){
        //
    }

    public static void FileIO(){
        //
    }

    public static void Threads_ParallelProcessing(){
        //
    }
}



/* OTHER RECURSION EXAMPLES TO INTERPRET/STUDY
    public static int exp(int base, int ex){
        if(ex == 1){
            return base;
        }

        return base * exp(base, ex - 1);
    }
    public static void main(String[] args) {
        System.out.println(exp(3, 4));
    }

    -----

    public static void printNumbers(int n){
        if(n > 0){
            System.out.print(n + " ");
            printNumbers(n - 1);
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {
        printNumbers(10);
    }
 */