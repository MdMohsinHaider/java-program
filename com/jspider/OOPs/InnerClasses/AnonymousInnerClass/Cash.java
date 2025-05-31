package com.jspider.OOPs.InnerClasses.AnonymousInnerClass;

public class Cash implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("Paid "+amount+" by using cash");
    }
}
