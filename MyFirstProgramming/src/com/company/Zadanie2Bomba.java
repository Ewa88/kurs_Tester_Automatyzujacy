package com.company;

import java.util.Scanner;

public class Zadanie2Bomba {
    public static void main(String[] args) {
        System.out.println("podaj liczbe dodania");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("bomba wybychnie za...");
            for (int i = number; i >= 0; i--) {
                System.out.println(i);
            }
            System.out.println("boom");
        } else {
            System.out.println("Podana liczba nie jest dodatnia");
        }

    }
}
