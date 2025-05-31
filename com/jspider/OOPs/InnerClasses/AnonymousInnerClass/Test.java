package com.jspider.OOPs.InnerClasses.AnonymousInnerClass;

public class Test {
    public static void main(String[] args) {

        // Shopping cart
        ShoppingCart shoppingCart = new ShoppingCart(150);

        // Example
//        shoppingCart.processPayment(new CreditCard("RuPay",1029384756));
//        shoppingCart.processPayment(new Cash());
//        shoppingCart.processPayment(new UPI());

        // Anonymous class implementing here
        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid "+amount+" by using card");
            }
        });
    }
}
