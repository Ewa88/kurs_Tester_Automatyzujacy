package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfTraining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ile masz lat?");
        int age = scanner.nextInt();

        if (age >= 18){
            System.out.println("jestes osoba pełnoletnia");
        }
        else {
            System.out.println("nie jestes osoba pełnoletnia");
        }
        System.out.println("koniec dzialania programu");

    }
}
