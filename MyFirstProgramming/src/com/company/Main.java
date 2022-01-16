package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Wyswietlanie danych
        System.out.println("Hello World!");
        System.out.println(5);
        System.out.println(false);

        int secondNumber;
        secondNumber = 15;
        System.out.println("My first second number: "+secondNumber);

        int number = 10;
        System.out.println("My first number: "+number);

        String text = "My first string!";
        System.out.println(text);

        boolean logicValue =true;
        System.out.println(logicValue);

// operatory matematyczne
        int add = 5;
        add += 3;
        System.out.println("wartosc zmiennej add: " +add);

        System.out.println("5 + 3: "+5+3); //to nie pokaze sumy, bo java traktuje po teksie liczby jako teksty, trzeba zmienne stworzyc
        System.out.println("5 + 3: "+(5+3));
        System.out.println("5 * 3: "+(5*3));
        System.out.println("5 - 3: "+(5-3));
        System.out.println("15 / 3: "+(15/3));

        int age = 17;
        System.out.println("wartosc age: "+age);
        age++;
        System.out.println("wartosc age zwiekszona: "+age);
        age--;
        System.out.println("wartosc age zmniejszona: "+age);


        //pobieranie wartosci od uzytkownika
        Scanner scanner  = new Scanner(System.in);

        System.out.println("jak masz na imie?");
        String name = scanner.nextLine();
        System.out.println("Witaj " +name);

        System.out.println("Podaj pierwszą liczbę");
        int userFirstNumber = scanner.nextInt();

        System.out.println("Podaj druga liczbę");
        int userSecondNumber = scanner.nextInt();

        System.out.println("Wynik dodawania to: ");
        System.out.println(userSecondNumber+userFirstNumber);

        // pętle

    }
}
