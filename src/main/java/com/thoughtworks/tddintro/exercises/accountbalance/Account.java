package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int balance;

    public Account(int initBalance) {
        balance = initBalance;
    }

    public void deposite(int money) {
        balance += money;
    }

    public void withDraw(int money) {
        if (balance >= money) {
            balance -= money;
        }
    }

    public int getBalance() {
        return balance;
    }
}
