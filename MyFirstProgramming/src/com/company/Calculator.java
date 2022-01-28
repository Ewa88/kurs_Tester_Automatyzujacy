package com.company;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Wynik dodawania 2+5 to: "+add(2, 5));
        System.out.println("Wynik odejmowania 10-2 to: "+substract(10, 2));
        System.out.println("Wynik mnozenia 2*5 to: "+multiply(2, 5));
        System.out.println("Wynik dzielenia 10/2 to: "+divide(10, 2));
    }
    public static int add(int a, int b){
       int result = a+b;
       return result;
    }
    public static int substract(int a, int b){
        int result = a-b;
        return result;
    }
    public static int multiply(int a, int b){
        int result = a*b;
        return result;
    }
    public static int divide(int a, int b){
        int result = a/b;
        return result;
    }
}
