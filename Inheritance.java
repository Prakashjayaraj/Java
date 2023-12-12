package Oops;
class Account {
    private String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Balance: $" + balance);
    }
}
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
        System.out.println("Added interest: $" + interest);
    }
}


class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Exceeds overdraft limit.");
        }
    }
}



public class Inheritance {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SAV001", 1000, 5);
        savings.displayBalance(); 
        savings.deposit(500);
        savings.displayBalance();
        savings.addInterest(); 
        savings.displayBalance(); 
        CheckingAccount checking = new CheckingAccount("CHK001", 2000, 1000);
        checking.displayBalance(); 
        checking.withdraw(1500); 
        checking.displayBalance(); 
        checking.withdraw(2000); 
    }
    }
