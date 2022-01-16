package com.company;

import java.util.Scanner;

public class TablicaImion {
    public static void main(String[] args) {
        int number=5;
        String[] names = new String[number];
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<number; i++) {
            System.out.println("podaj imię numer: " + (i+1));
            names[i] = scanner.nextLine();
        }
        for(int i=0; i<number; i++) {
            System.out.println("Witaj " + names[i]);

        }
    }
}
