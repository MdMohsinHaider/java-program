package com.jspider.OOPs.InnerClasses.AnonymousInnerClass;

public class CreditCard implements Payment{

    private String cardName;
    private long cardNumber;

    CreditCard(String cardName, long cardNumber){
        this.cardName = cardName;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("paid "+ amount+" by using Credit Card."+"\ncard number: "+cardNumber+"\ncard name: "+ cardName);
    }
}
