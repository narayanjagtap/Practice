/*
 *Problem: Banking System Simulation with Exception Handling
Description:
Create a simple Java program that simulates basic banking operations like deposit, withdraw, and balance check. The program should handle exceptions related to invalid operations using Java Exception Handling mechanisms.

Requirements:
Create a BankAccount class with the following:
Fields: accountNumber, accountHolderName, balance
Constructor to initialize account

Methods:
deposit(double amount)
withdraw(double amount) – throw an exception if insufficient balance
checkBalance()

Custom Exception Class:
InsufficientFundsException (extends Exception)

Main Class (BankApp):
Accept user input for operations (Use Scanner)

Use try-catch blocks to handle:
Invalid amount (negative input)
Insufficient funds
Input mismatch (non-numeric input)
Use multiple catch blocks
Always close the Scanner in a finally block
Use throw for invalid amount input
Use throws in method signatures where appropriate
 */

import java.util.InputMismatchException;
import java.util.Scanner;

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message) {
        super(message);
    }
}
class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public double getBalance(){
        return balance;
    }


    public void deposit(Scanner scan){
        System.out.print("Enter amount to deposit: ");
        double amount = scan.nextDouble();
        balance = balance + amount;
        System.out.println("Diposit Succesfully you amount " + amount);
    }
    public void withdraw(Scanner scan) throws InsufficientFundsException {
        System.out.print("Enter amount to withdraw: ");
        double amount = scan.nextDouble();
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Widrow sucessufully your amount : " + amount);
        }
        else{
            throw new InsufficientFundsException("Insufficient balance");
        }
    }
    public double checkBalance(){
        return balance;
    }
}
public class dada {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String name = "";
        int number = 0;
        double iBalance = 0.0;

        try {
            System.out.print("\nEnter AccountHolder Name : ");
            name = scan.nextLine();

            System.out.print("\nEnter AccountNumber : ");
            number = scan.nextInt();

            System.out.print("\nEnter Initial Bank balance : ");
            iBalance = scan.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
            return; // exit the method if input is invalid
        }

        BankAccount b = new BankAccount(number, name, iBalance);

        loop:
        while (true) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposite ");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose your option : ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1: System.out.println("Current Balance: " + b.checkBalance());
                    
                    break;

                case 2: b.deposit(scan);
                    
                    break;

                case 3: try {
                        b.withdraw(scan);
                        } catch (InsufficientFundsException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    
                    break;

                case 4: System.out.println("Thank you! Exiting...");
                    
                    break loop;
            
                default:System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        
    }
}