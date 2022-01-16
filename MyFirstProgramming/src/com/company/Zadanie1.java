package com.company;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie");
        String name = scanner.nextLine();
        switch (name) {
            case "Ewa":
                System.out.println("Cześć Ewa");
                break;
            case "Asia":
                System.out.println("Cześć Asia");
                break;
            case "Stefan":
                System.out.println("Cześć Stefan");
                break;
            default:
                System.out.println("Przykro mi, ale Cię nie znam");

        }

    }
}
