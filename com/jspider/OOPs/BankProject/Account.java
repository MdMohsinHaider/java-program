package com.jspider.OOPs.BankProject;

public class Account {

    private String accountNumber;
    private Money balance;

    public Account() {}

    public Account(String accountNumber, Money balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Money getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance.setAmount(balance.getAmount() + amount);
    }

    public boolean withdraw(double amount) {
        if (amount <= balance.getAmount()) {
            balance.setAmount(balance.getAmount() - amount);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account No: " + accountNumber + ", Balance: " + balance;
    }
}
