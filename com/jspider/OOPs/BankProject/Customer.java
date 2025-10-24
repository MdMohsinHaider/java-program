package com.jspider.OOPs.BankProject;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private String email;
    private List<Account> accounts;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account getAccountByNumber(String accNo) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accNo)) {
                return acc;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Customer: " + name + ", Accounts: " + accounts;
    }
}
