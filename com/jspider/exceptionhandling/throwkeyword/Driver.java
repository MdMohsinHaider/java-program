package com.jspider.exceptionhandling.throwkeyword;

import java.util.Scanner;

public class Driver {

    public Driver(){
        // default
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Driver driver = new Driver();
        try {
            driver.isVote(scanner);
        }catch (YoungerAgeException e){
            System.out.println(e.getMessage());
        }

    }

    private void isVote(Scanner scanner){
        System.out.print("Enter Your Age : ");
        int age = scanner.nextByte();
        if (age<18){
            throw new YoungerAgeException("age less then 18 not eligible to vote");
        }
        else {
            System.out.println("Eligible to vote");
        }
    }
    
}
