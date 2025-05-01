/*
Problem 1: Bank Account Management
Create a BankAccount class with the following attributes:
account_number (private)
balance (private)
owner_name (public)

The class should have:
A constructor to initialize the attributes.
Methods to deposit and withdraw money.
A method to check the balance.
Prevent negative withdrawals and ensure the account balance doesn’t go below zero.
*/

import java.util.Scanner;

class BankAccount {
    private long account_number;
    private long balance;
    public String owner_name;

    BankAccount(long account_number, long balance, String owner_name) {
        this.account_number = account_number;
        this.balance = balance;
        this.owner_name = owner_name;
    }

    public void deposit(Scanner sc) {
        System.out.print("Enter Amount to Deposit: ");
        long deposit = sc.nextLong();
        if (deposit > 0) {
            balance += deposit;
            System.out.println("Deposit successful! New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(Scanner sc) {
        System.out.print("Enter Amount to Withdraw: ");
        long withdraw = sc.nextLong();
        if (withdraw > balance) {
            System.out.println("Insufficient balance! You have only " + balance);
        } else if (withdraw > 0) {
            balance -= withdraw;
            System.out.println("Withdrawal successful! Remaining Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public long getBalance() {
        return balance;
    }

    public long getAccount_number() {
        return account_number;
    }
}

public class dada1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BankAccount bank = new BankAccount(45478112864597334L, 30000L, "Pandurang Jagtap");

        System.out.println("\nYour Account Status:");
        System.out.println("Account No: " + bank.getAccount_number());
        System.out.println("Bank Balance: " + bank.getBalance());
        System.out.println("Owner Name: " + bank.owner_name);

        while (true) {
            System.out.println("\n1: Deposit Money");
            System.out.println("2: Withdraw Money");
            System.out.println("3: Check Balance");
            System.out.println("4: Exit");

            System.out.print("\nChoose an operation: ");
            int choose = scan.nextInt();

            switch (choose) {
                case 1:
                    bank.deposit(scan);
                    break;
                case 2:
                    bank.withdraw(scan);
                    break;
                case 3:
                    System.out.println("Current Balance: " + bank.getBalance());
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    scan.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please select from 1-4.");
            }
        }
    }
}
