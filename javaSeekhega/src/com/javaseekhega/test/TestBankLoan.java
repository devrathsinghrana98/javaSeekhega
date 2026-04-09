package com.javaseekhega.test;

public class TestBankLoan {
    public static void main(String[] args){
        BankLoan bankLoan1 = new BankLoan();
        bankLoan1.setAccountNumber(342422423);
        bankLoan1.deposit(213132);
        bankLoan1.withdraw(100000000);
        bankLoan1.withdraw(213132);
        bankLoan1.withdraw(-100);
        bankLoan1.deposit(100.2);
        System.out.println(bankLoan1.getBalance());
        System.out.println(bankLoan1.getAccountNumber());
    }
}
