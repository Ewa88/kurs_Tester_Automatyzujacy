package com.company;

import java.util.Scanner;

public class TablicaUzytkownika {
    public static void main(String[] args) {
        int number = -1;
        System.out.println("podaj dodatnia liczbę elementów tablicy");
        Scanner scanner = new Scanner(System.in);
        while (number < 0) {
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Podales liczbe ujemna, podaj dodatnia");
            }
        }

        int[] numbers = new int[number];
        int i = 0;
        while (i < numbers.length) {
            numbers[i] = i + 1;
            System.out.println("liczba tablicy stojaca na indeksie " + i + " jest równa: " + numbers[i]);
            i++;
        }
    }
}
