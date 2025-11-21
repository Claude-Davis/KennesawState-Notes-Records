// prompt: https://www.kennesaw.edu/ccse/first-year-experience/cse1322l/labs/1322l-lab-1-v1.pdf

import java.util.Scanner; //imports the class Scanner to allow for user input

public class BudgetSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // creates an object of the class Scanner saved as "scan"

        System.out.println("[Budgeting System]");

        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.print("Hello " + name + ". Please enter your monthly salary: ");
        double salary = scan.nextDouble();

        System.out.println(" ");  // blank space for a "break" between sections

        System.out.print("What is the total amount of your loan? ");
        double loan_principal = scan.nextDouble();

        System.out.print("What is the interest rate of your loan? ");
        double loan_interest = scan.nextDouble() / 100;
        double new_principal = loan_principal * Math.pow((1 + (loan_interest / 12)), 12);               // format for exponents Math.pow(base, exponent)

        System.out.println(" ");

        double yearly_salary = salary * 12;
        System.out.println("Your yearly salary is $" + yearly_salary);
        System.out.println("In 12 months, your loan's principal will be $" + new_principal);

        System.out.println(" ");  // blank space for a "break" between sections

        System.out.println("At the end of the year, you will have paid off your debt: " + (yearly_salary >= new_principal));
        System.out.println("At the end of the year, you will still have some debt left: " + (yearly_salary < new_principal));
        System.out.println("At the end of the year, you will have $" + (yearly_salary - new_principal) + " of your salary left.");

        System.out.println(" ");

        System.out.println("The government is offering loan relief for persons 25 and under, and for those 65 and over.");
        System.out.print("What is your age? ");
        int age = scan.nextInt();

        boolean eligible_for_relief = (age <= 25) || (age >= 65);  // "||" is the logical operator "or"
        System.out.println("The relief is $10000. You are eligible for relief: " + eligible_for_relief);

        boolean loan_paid_off = (yearly_salary >= new_principal) || (eligible_for_relief && ((yearly_salary + 10000) >= new_principal));  // "&&" is the logical operator "and"
        System.out.print("With our without relief, you will be able to pay your loan in full: " + loan_paid_off);
    }
  }