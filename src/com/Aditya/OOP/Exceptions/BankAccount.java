package com.Aditya.OOP.Exceptions;

// User defined Exception
class InsufficientMoneyException extends Exception{
    public InsufficientMoneyException(String message){
        super(message);
    }
}

// Checking Account class
class CheckingAccount{
    private double balance;
    public CheckingAccount(double initialBalance){
        this.balance = initialBalance;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }
    public void withdraw(double amount) throws InsufficientMoneyException{
        if(amount > balance){
            throw new InsufficientMoneyException("Low Balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("Balance: " + balance);
    }
    public void showBalance(){
        System.out.println("Current Balance: Rs" + balance);
    }
}
public class BankAccount {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(1000);
        account.deposit(500);
        try{
            account.withdraw(500);
            account.withdraw(1200);
        }catch (InsufficientMoneyException e){
            System.out.println("Exception: " + e.getMessage());
        }
        account.showBalance();
    }
}
