package com.javaseekhega.test;

public class BankLoan {
    private double balance;
    private long accountNumber;

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount){
        if(amount<0){
            System.out.println("Amount cannot be negative.");
            return;
        }
        balance+=amount;

    }

    public void withdraw(double amount){
        if(amount<0 || amount>balance){
            System.out.println("Amount cannot be negative and it should be less than balance.");
            return;
        }
        balance-=amount;
    }
}
