package com.assignment;

import java.util.ArrayList;

class Account {
    private String accountNumber;
    private String customerName;
    private double balance;

    public Account(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void printDetails() {
        System.out.println("Account Number: " + accountNumber + ", Customer Name: " + customerName + ", Balance: " + balance);
    }
}

class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public void printAllAccounts() {
        for (Account account : accounts) {
            account.printDetails();
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Account account1 = new Account("12345", "Alice", 1000);
        Account account2 = new Account("67890", "Bob", 2000);

        bank.addAccount(account1);
        bank.addAccount(account2);

        bank.printAllAccounts();

        account1.deposit(500);
        account1.printDetails();

        account2.withdraw(300);
        account2.printDetails();

        bank.removeAccount(account1);
        bank.printAllAccounts();
    }
}
