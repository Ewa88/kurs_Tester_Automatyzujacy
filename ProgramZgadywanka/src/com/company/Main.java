package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Witaj w programie Zgadywanka");
        int numberToGuess = new Random().nextInt(100);
        System.out.println("Zgadnij wylosowana liczbę z zakresu 0-99");
        System.out.println("Pamiętaj masz tylko 5 prób");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj liczbę");
            int userNumber = scanner.nextInt();
            if (userNumber > 99) {
                System.out.println("Twoja liczba jest za duża");
            } else if (userNumber < 0) {
                System.out.println("Twoja liczba jest za mała");
            } else if (userNumber != numberToGuess) {
                System.out.println("niestety to nie ta liczba");
                if (i == 4) {
                    System.out.println("wylosowana liczba to liczba:" + numberToGuess);
                }
            } else {
                System.out.println("brawo! wylosowana liczba to liczba:" + numberToGuess);
                break;
            }
        }

    }
}

