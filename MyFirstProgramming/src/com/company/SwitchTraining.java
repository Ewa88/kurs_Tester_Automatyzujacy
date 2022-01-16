package com.company;

import java.util.Scanner;

public class SwitchTraining {
    public static void main(String[] args) {
        System.out.println("wprowadź liczbe");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch(number){
            case 1:
                System.out.println("Wybrana liczba to 1");
                break;
            case 2:
                System.out.println("Wybrana liczba to 2");
                break;
            case 3:
                System.out.println("Wybrana liczba to 3");
                break;
            case 4:
                System.out.println("Wybrana liczba to 4");
                break;
            default:
                System.out.println("Wybrana liczba nie miesci sie w zakresie <1,4>");
        }
        System.out.println("finito");
        System.out.println("wprowadź tekst");
        scanner.next(); //gdy pobrano juz liczbe, achce sie kolejny tekst,
                        // to trzeba uzyc tej frazy by ponownie wyszukac

        String text = scanner.nextLine();
        switch(text){
            case "ABC":
                System.out.println("Wprowadzono ABC");
                break;
            case "DEF":
                System.out.println("Wprowadzono DEF");
                break;
            default:
                System.out.println("Wprowadzono nieznany tekst");
        }
        System.out.println("finito");
    }
}
