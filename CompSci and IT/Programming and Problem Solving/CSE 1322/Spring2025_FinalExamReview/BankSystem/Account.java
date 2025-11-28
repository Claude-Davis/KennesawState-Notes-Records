

import java.text.DecimalFormat;

class Account {
    DecimalFormat df = new DecimalFormat("#.00");

    private int accountNumber;
    private static int nextNumber=10001;
    private double accountBalance;

    public Account(){
        this.accountNumber = nextNumber;
        nextNumber++;
        this.accountBalance = 0;
    }

    public Account (double accountBalance){
        this.accountBalance = accountBalance;
        this.accountNumber = nextNumber;
        nextNumber++;
        this.accountBalance = 0;
    }

    public double withdraw(double amount) {
        accountBalance -= amount;
        return  accountBalance;
    }

    public double deposit(double amount) {
        accountBalance += amount;
        return  accountBalance;
    }

    public double getBalance() {
        return accountBalance;
    }

    public int getNumber() {
        return  accountNumber;
    }

    @Override
    public String toString() {
        return "Account #" + accountNumber + ", Balance $" + df.format(accountBalance);
    }
}
