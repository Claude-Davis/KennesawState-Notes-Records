import java.util.Scanner;

public class RecursiveMath{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        //initialize option
        int option = 0;

        while (option != 6){
            //menu
            System.out.println("1. Multiply 2 numbers");
            System.out.println("2. Divide 2 numbers");
            System.out.println("3. Mod 2 numbers");
            System.out.println("4. Echo sentence");
            System.out.println("5. Determine if reverse");
            System.out.println("6. Quit");
            System.out.print("Enter option: ");

            option = scan.nextInt();

            //main loop 
            switch(option){
                case 1:                                             //multiply
                    System.out.print("Enter first number: ");
                        int num1= scan.nextInt();
                    System.out.print("Enter second number: ");
                        int num2= scan.nextInt();

                    System.out.println("Your product is " + recursiveMultiply(num1, num2));
                    System.out.println(" ");
                    break;
                case 2:                                             //divide
                    System.out.print("Enter first number: ");
                        num1= scan.nextInt();
                    System.out.print("Enter second number: ");
                        num2= scan.nextInt();

                    System.out.println("Your quotient is " + recursiveDivision(num1, num2));
                    System.out.println(" ");
                    break;
                case 3:                                             //remainder
                    System.out.print("Enter first number: ");
                        num1= scan.nextInt();
                    System.out.print("Enter second number: ");
                        num2= scan.nextInt();

                    System.out.println("Your modulus is " + recursiveRemainder(num1, num2));
                    System.out.println(" ");
                    break;
                case 4:                                             //echo method
                    System.out.print("Enter your sentence: ");
                        scan.nextLine();
                        String sentence = scan.nextLine();
                    System.out.print("Repeat how many times? ");
                        int N = scan.nextInt();
                    System.out.println("You sentence repeated " + N + " times is...");
                    System.out.print(recursiveEcho(sentence, N));
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                case 5:                                             //reverse
                    System.out.print("Enter a sentence: ");
                        scan.nextLine();
                        sentence = scan.nextLine();
                    System.out.print("Enter another sentence: ");
                        String sentence1 = scan.nextLine();
                    if (recursiveReverse(sentence, sentence1) == false){ System.out.println("The sentences are NOT opposites of each other.");}
                    if (recursiveReverse(sentence, sentence1) == true){ System.out.println("The sentences ARE opposites of each other.");}
                    System.out.println(" ");
                    break;
            }
        }
        System.out.println("Shutting off...");
    }

    //integer type methods
    public static int recursiveMultiply(int a, int b){
        if (b==0){ return 0;}  //base case
        return a + recursiveMultiply(a, b-1); //the value of "b" is reduced each time the method is called; acts similar to a countdown
        //this method continues to add the value of "a" to itself until it has done so "b" amount of times
    }

    public static int recursiveDivision(int a, int b){
        if (b==0){ return -1;}  //base case
        if (a<b){ return 0;} //the method ends (adds 0 to the current value) once "a" is less than "b"
        return 1 + recursiveDivision(a-b, b);
        //this method starts with a value of 1 and continues to add 1 for each time the method is called
    }

    public static int recursiveRemainder(int x, int y){
        if (y == 0) { return -1;} //base case
        if (x>=y){ return recursiveRemainder(x-y, y);}  //continues to call this method until the value of "x" is less than that of "y"; "y" is taken from "x" with each call; once "x" is less than "y", that is the remainder
        return x;
    }

    //String type method
    public static String recursiveEcho(String m, int N){
        if (N==0){ return "";}  //base case
        String echo = m + recursiveEcho(m, N-1); 
        return echo;
        //the method is called until the value of "N" is 0
    }

    //boolean type method
    public static boolean recursiveReverse(String d, String e){
        //convert both strings to all lowercase letters to avoid errors caused by differences in case
        d = d.toLowerCase();
        e = e.toLowerCase();
        if (d.length() != e.length()){ return false;}   //base case
        if (d.length()<=1){ return true;}
        if ((!d.substring(0,1).equals(e.substring(e.length()-1)))){ return false;}
                                                                /* if (d.length() == e.length()){
                                                                    String eReversed = new StringBuilder(e).reverse().toString();  //this reverses the content of "e" and saves it to the variable "eReversed"
                                                                    if (d.equalsIgnoreCase(eReversed)){  //"d" and "eReversed" are compared
                                                                        return true;
                                                                    } else {return false;}
                                                                } */
        return recursiveReverse(d.substring(1), e.substring(0,e.length()-1));
    }
}