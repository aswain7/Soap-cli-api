package org.concepts;

public class Bank_Account {
    private double balance;

    public void deposit(double amount) {

        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Bank_Account ba =new Bank_Account();
        ba.deposit(1000);
        System.out.println(ba.getBalance());
    }
}
