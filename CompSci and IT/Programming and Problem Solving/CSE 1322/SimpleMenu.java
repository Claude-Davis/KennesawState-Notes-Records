//prompt: https://www.kennesaw.edu/ccse/first-year-experience/cse1322l/labs/cse-1322l-lab-2-v1.pdf

import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Count from a number to another");
        System.out.println("2. Determine largest number");
        System.out.println("3. Type in word");
        System.out.println("4. Quit");

        System.out.print("Enter option: ");
        int option = scan.nextInt();
        System.out.println(" ");

        while (option != 4){

            System.out.println(" ");

                    switch(option) {
                        case 1:  // if the user chooses '1,' the counting method is called
                            System.out.print("Enter the start point: ");
                            int start = scan.nextInt();

                            System.out.print("Enter the end point: ");
                            int end = scan.nextInt();

                            System.out.println("Counting from " + start + " to " + end + "...");

                            counting(start, end);
                            break; //this prevents the program from automatically continuing to the next method
                        case 2:  // calls the largestNumber method
                            System.out.println("This option will display the largest number entered. Enter 0 when done.");
                            largestNumber();
                            break; //this prevents the program from automatically continuing to the next method
                        case 3: //calls the computer method
                            computer();
                            break; //this prevents the program from automatically continuing to the next method
                    }

                    options_list(); // calls the "options_list" method
                    System.out.print("Enter option: ");
                    option = scan.nextInt();        //removing the "int" allows for resuse of "option" redefining it
        }
        System.out.print("Shutting off...");
    }

    public static void options_list(){
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Count from a number to another");
        System.out.println("2. Determine largest number");
        System.out.println("3. Type in word");
        System.out.println("4. Quit");
    }

    public static void counting(int start, int end){    // method for CASE 1
                    if (start == end){  // if the start and end numbers are the same...
                        System.out.println("Start and end are the same!");
                        System.out.println("Done counting.");

                        System.out.println(" ");
                    }
                    else {          // if the start and end numbers are not the same...
                        if (start > end){    // AND if the start number is larger than the end number...
                            int num = start;
                            while(num >= end) { // then while num is greater than the end number, continue to print num (num decreases by 1 after each print until it is finally equal to the end number)
                                System.out.println(num);
                                num = num - 1;
                            }
                            System.out.println("Done counting.");  // this line of code is printed once num is equal to the end number

                            System.out.println(" ");
                        }
                        else if (end > start){   //AND if the end number is greater than the start number...
                            int num = start;
                            while(num <= end){  //then while num is less than the end number, continue to print num (num is increased by 1 after each print until it is equal to the end number)
                                System.out.println(num);
                                num = num + 1;
                            }
                            System.out.println("Done counting.");   // this line of code is printed once num is equal to the start number

                            System.out.println(" ");
                        }
                    }
    }

    public static void largestNumber(){
                    Scanner scan = new Scanner(System.in);
                    int num = 0;
                    System.out.print("Enter a number (current largest is " + num + "): ");

                    boolean run = true;
                    while (run) {
                            int userNum = scan.nextInt();

                            if (userNum > num) {
                                num = userNum;
                                System.out.print("Enter a number (current largest is " + num + "): ");
                            }
                            else if ((userNum < num) && (userNum != 0)) {
                                num = num;
                                System.out.print("Enter a number (current largest is " + num + "): ");
                            }
                            else if (userNum == 0){
                                System.out.println("The largest number entered was " + num);
                                System.out.println(" ");
                                run = false;
                            }
                    }
    }

    public static void computer(){
                    Scanner scan = new Scanner(System.in);
                    System.out.print("Type in the word 'Computer': ");
                    String word = scan.nextLine();

                    boolean run = true;
                    while (run) {
                        if (word.equals("Computer")){   // use .equals() to compare string values
                            System.out.println("Correct!");
                            System.out.println(" ");
                            run = false;
                        }
                        else {
                            System.out.print("Incorrect. You must type 'Computer': ");
                            word = scan.nextLine();
                        }
                    }
    }
}
