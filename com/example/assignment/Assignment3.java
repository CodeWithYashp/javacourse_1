package com.example.assignment;

class BankAccount{
    private int balance;
    private String name;
    public BankAccount(int balance, String name){
        this.balance = balance;
        this.name = name;
    }
    void deposit(int amount){
        this.balance += amount;
        System.out.println("Amount Deposited: "+ amount+ " in " + this.name + "'s account and Balance Remaining: " + this.balance);
    }
    void withdraw(int amount){
        this.balance -= amount;
        System.out.println("Amount Withdrawn: " + amount +" from " + this.name + "'s account and Balance Remaining: " + this.balance);
    }
}
public class Assignment3 {
    public static void main(String[] args){
        BankAccount myAc = new BankAccount(1000, "Yash Sharma");
        myAc.deposit(300);
        myAc.withdraw(500);
    }

}
