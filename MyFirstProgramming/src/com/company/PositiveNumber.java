package com.company;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number= -1;
        System.out.println("Podaj liczbe dodatnia");
        while (number <0){
            number = scanner.nextInt();
            if(number<0){
                System.out.println("Podales liczbe ujemna, podaj dodatnia");
            }
        }
        System.out.println("koniec programu");
    }
}
