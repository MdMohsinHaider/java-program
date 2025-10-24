package com.jspider.OOPs.BankProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private List<Customer> customers = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void start() {
        int choice;
        do {
            System.out.println("\n====== BankProject Menu ======");
            System.out.println("1. Create Customer & Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createCustomer();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    viewAccount();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you for using our bank.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }

    private void createCustomer() {
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();
        System.out.print("Enter initial deposit: ");
        double amount = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Enter currency: ");
        String currency = sc.nextLine();

        Money balance = new Money(amount, currency);
        Account account = new Account(accNo, balance);
        Customer customer = new Customer(name, email);
        customer.addAccount(account);

        customers.add(customer);
        System.out.println("Customer and account created successfully.");
    }

    private Customer findCustomerByAccountNumber(String accNo) {
        for (Customer c : customers) {
            Account acc = c.getAccountByNumber(accNo);
            if (acc != null) return c;
        }
        return null;
    }

    private void deposit() {
        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();
        Customer c = findCustomerByAccountNumber(accNo);
        if (c != null) {
            Account acc = c.getAccountByNumber(accNo);
            System.out.print("Enter amount to deposit: ");
            double amt = sc.nextDouble();
            acc.deposit(amt);
            System.out.println("Deposit successful. New Balance: " + acc.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    private void withdraw() {
        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();
        Customer c = findCustomerByAccountNumber(accNo);
        if (c != null) {
            Account acc = c.getAccountByNumber(accNo);
            System.out.print("Enter amount to withdraw: ");
            double amt = sc.nextDouble();
            if (acc.withdraw(amt)) {
                System.out.println("Withdrawal successful. New Balance: " + acc.getBalance());
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    private void viewAccount() {
        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();
        Customer c = findCustomerByAccountNumber(accNo);
        if (c != null) {
            Account acc = c.getAccountByNumber(accNo);
            System.out.println("Account Details:\n" + acc);
        } else {
            System.out.println("Account not found.");
        }
    }
}
