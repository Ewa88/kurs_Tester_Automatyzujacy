package com.company;

public class JavaMethodsWithParams {
    public static void main(String[] args) {
        System.out.println("wynik 4+5 to: "+ add(4,5));

        print("wynik 2+2 to: ",add(2,2));

        String text = "wynik 10+5 to: ";
        int numberToAdd = 10;
        print(text,add(numberToAdd,5));
    }
    public static int add(int a, int b){
        System.out.println("I got params: "+ a +" i " +b);
        return a+b;
    }

    public static void print(String textToPrint, int number){
        System.out.println(textToPrint+" ma wiek " + number);
    }
}
