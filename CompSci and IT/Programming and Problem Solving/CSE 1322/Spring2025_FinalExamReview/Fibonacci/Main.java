//package Fibonacci;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        FindFib iteration = new FibIteration();
        FindFib formula = new FibFormula();

        System.out.print("Enter a number to start: ");
        int num = scan.nextInt();

        if ((num < 0) || (num > 40)){
            System.out.println("Number must be between 0 and 40.");
        } else {

            System.out.println("Fib of 6 using iteration is " + iteration.calculateFib(num));
            System.out.println("Fib of 6 using Binet's Formula is " + formula.calculateFib(num));
        }

        System.out.println("\n Program Complete");
    }
    
}
