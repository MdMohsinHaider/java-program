package com.jspider.lib;

public class SingletonClass {

    private static SingletonClass userInput;

    private SingletonClass(){};
    public static SingletonClass getUserInput(){
        if (userInput == null){
            synchronized (SingletonClass.class){
                return userInput = new SingletonClass();
            }
        }
        return userInput;
    }
}
