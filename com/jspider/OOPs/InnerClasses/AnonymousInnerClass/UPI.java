package com.jspider.OOPs.InnerClasses.AnonymousInnerClass;

public class UPI implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid "+amount+" by using UPI");
    }
}
