

import java.text.DecimalFormat;

public class Savings extends Account{
    DecimalFormat df = new DecimalFormat("#.00");

    private int numberOfDeposits=0;

    public Savings(double balance){
        super(balance);
    }

    @Override
    public double withdraw(double amount){
        double accountBalance = super.withdraw(amount);
        if (accountBalance < 500){
            System.out.println("Charging a fee of $10 because account is below $500.");
            accountBalance = super.withdraw(10);
        }
        return  accountBalance;
    }

    @Override
    public double deposit(double amount){
        double accountBalance = super.deposit(amount);
        numberOfDeposits++;
        System.out.println("This is deposit " + numberOfDeposits + " to this account.");
        if (numberOfDeposits > 5) {
            System.out.println("Charging a fee of $10");
            accountBalance -= super.withdraw(10);
        }
        return  accountBalance;
    }

    public double addInterest(){
        double interest = getBalance() * 0.015;
        double accountBalance = super.deposit(interest);
        System.out.println("You have earned $" + interest + " in interest.");
        return  accountBalance;
    }

    @Override
    public String toString(){
        return "Savings Account #" + getNumber() + ", Balance: $" + df.format(getBalance());
    }
}
