package com.jspider.OOPs.InnerClasses.AnonymousInnerClass;

public class ShoppingCart {
    private double totalAmount;

    // Constructor init object ShoppingCart class
    public ShoppingCart(double totalAmount){
        this.totalAmount = totalAmount;
    }

    // Payment Process Method
    public void processPayment(Payment paymentMethod){
        paymentMethod.pay(totalAmount);
    }
}
