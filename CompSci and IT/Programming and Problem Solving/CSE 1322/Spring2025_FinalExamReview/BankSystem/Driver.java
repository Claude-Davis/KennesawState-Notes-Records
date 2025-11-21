

import java.util.Scanner;
import java.text.DecimalFormat;

public class Driver {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        Checking checking = new Checking(0);
        Savings savings = new Savings(500);

        System.out.println("[Banking System]");
        int opt = 0;

        while (opt != 8) {
            System.out.println("1. Withdraw from Checking");
            System.out.println("2. Withdraw from Savings");
            System.out.println("3. Deposit to Checking");
            System.out.println("4. Deposit to Savings");
            System.out.println("5. See Checking Balance");
            System.out.println("6. See Savings Balance");
            System.out.println("7. Award Interest");
            System.out.println("8. Exit Program");

            System.out.print("Enter option: ");
            opt = scan.nextInt();

            System.out.println(" ");

            switch (opt){
                case 1:
                    System.out.print("Enter amount to withdraw from Checking: $");
                    double withdrawlAmount = scan.nextDouble();

                    checking.withdraw(withdrawlAmount);
                    System.out.println("Current balance of Checking is $" + df.format(checking.getBalance()));

                    System.out.println(" ");
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw Savings: $");
                    withdrawlAmount = scan.nextDouble();

                    savings.withdraw(withdrawlAmount);
                    System.out.println("Current balance of Savings is $" + df.format(savings.getBalance()));

                    System.out.println(" ");
                    break;

                case 3:
                    System.out.print("Enter amount to deposit to Checking: $");
                    double depositAmount = scan.nextDouble();

                    checking.deposit(depositAmount);
                    System.out.println("Current balance of Checking is $" + df.format(checking.getBalance()));

                    System.out.println(" ");
                    break;

                case 4:
                    System.out.print("Enter amount to deposit to Savings: $");
                    depositAmount = scan.nextDouble();

                    savings.deposit(depositAmount);
                    System.out.println("Current balance of Savings is $" + df.format(savings.getBalance()));

                    System.out.println(" ");
                    break;

                case 5:
                    System.out.println(checking.toString());

                    System.out.println(" ");
                    break;

                case 6:
                    System.out.println(savings.toString());

                    System.out.println(" ");
                    break;

                case 7:
                    savings.addInterest();

                    System.out.println("Current balance of Savings is $" + df.format(savings.getBalance()));

                    System.out.println(" ");
                    break;

                default:
                    if (opt !=8){
                        System.out.println("Invalid entry");
                        System.out.println(" ");
                        break;
                    }
            }
        }
        System.out.println("Exiting program...");
    }
}
