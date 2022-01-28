package com.company;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(2,4));
        System.out.println(add(2,4, 5));
        System.out.println(add("2","4"));
    }

    //przeciazanie metod - klikla metod o tej samej nazwie ale z roznymi parametrami

    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a, int b, int c){
        return a+b+c;
    }
    public static int add(String a, String b){
     int x=Integer.parseInt(a);
        int y = Integer.parseInt(b);
        return x+y;
    }
}
