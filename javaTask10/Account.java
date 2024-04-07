//Program 4: Account class with 2 constructors and methods to deposit and withdraw balance
package javaTask10;

import java.util.Scanner;

public class Account {
    // Declaration of Data member of the Account class
    private double balance;

    // Construction with no parameters
    public Account() {
        balance = 0;
    }

    // Parameterized constructors with 2 parameters
    public Account(double accBalance, long accNumber) {
        this.balance = accBalance;
        System.out.println(
                "The Initial account balance of account with account number (" + accNumber + ") is " + balance);
    }

    // Getter method to fetch the Balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit amount in the account and display the balance
    public void deposit(double dAmount) {
        if (dAmount > 0) {
            balance += dAmount;
            System.out.println("Account balance after deposit of " + dAmount + " is " + balance);
        } else
            System.out.println("Invalid amount. Please enter a valid amount greater than zero");

    }

    // Method to withdraw the amount from the account and display the balance
    public void withdraw(double wAmount) {
        if (balance >= wAmount && wAmount > 0) {
            balance -= wAmount;
            System.out.println("Account balance after withdraw of " + wAmount + " is " + balance);
        }

        else if (wAmount <= 0)
            System.out.println("Invalid amount. Please enter a valid amount greater than zero");

        else
            System.out.println("Insufficient Balance for withdrawl");
    }

}

class AccountMain {
    public static void main(String[] args) {
        // Variable declaration to store the account number, initial balance and amount
        // for deposit/withdrawl
        long accNo;
        double openBal, amount;
        Scanner sc = new Scanner(System.in);
        // User input fetched for the account number and start amount deposit for
        // account opening
        System.out.println("Please enter the account number");
        accNo = sc.nextLong();
        System.out.println("Please enter the amount with which account is to be opened");
        openBal = sc.nextDouble();

        // Invoking the parameterized constructor
        Account aObj = new Account(Math.abs(openBal), accNo);

        // Amount deposit
        System.out.println("Please enter the amount to be deposited");
        amount = sc.nextDouble();
        aObj.deposit(amount);

        // Amount Withdrawn
        System.out.println("Please enter the amount to be withdrawn");
        amount = sc.nextDouble();
        aObj.withdraw(amount);
        sc.close();

    }
}
