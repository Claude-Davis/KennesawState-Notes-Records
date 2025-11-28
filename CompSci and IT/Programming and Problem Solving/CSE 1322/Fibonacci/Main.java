package  Fibonacci;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        FindFib iteration = new FibIteration();
        FindFib formula = new FibFormula();

        System.out.print("Find which position in the Fibonacci Sequence? ");
        int n = scan.nextInt();

        System.out.println("Fib of 6 using iteration is " + iteration.calculateFib(n) + ".");
        System.out.println("Fib of 6 using Binet's Formula is " + formula.calculateFib(n) + ".");
        System.out.println("Program complete.");
    }
}
