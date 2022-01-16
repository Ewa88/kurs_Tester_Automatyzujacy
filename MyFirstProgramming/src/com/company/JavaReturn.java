package com.company;

public class JavaReturn {
    public static void main(String[] args) {
        System.out.println("i'm before method");
        int number = getNumber();

        System.out.println("i'm after method");
        System.out.println(number);

        int result = 5 + getNumber() + getNumber();
        System.out.println(result);
    }

    
    public static int getNumber() {
        System.out.println("i'm inside method");
        int number = 5;
        return number;
    }
}
