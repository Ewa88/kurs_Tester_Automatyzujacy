package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Witaj uzytkowniku");
        System.out.println("Podaj ilosc zmiennych z ktorych ma się składać tablica");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Teraz wprowadź wartości do tablicy");

        for (int i=0; i<size; i++){
            System.out.println("Podaj "+(i+1)+" element");
            numbers[i]=scanner.nextInt();
        }

        //sortowanie
        int test=1;
        while (test>0) {
            test=0;
            for (int i=0; i < (size-1); i++){
              if (numbers[i]>numbers[i+1]) {
                  test++;
                  int temp = numbers[i];
                  numbers[i]=numbers[i+1];
                  numbers[i+1]=temp;
              }
            }

        }
        //srednia
        int suma=0;
        for(int i=0; i<size; i++){
            suma += numbers[i];
        }
        int srednia=suma/size;

        System.out.println("Największa wprowadzona wartość to: "+numbers[(size-1)]);
        System.out.println("Srednia wartosc to: "+srednia);
    }
}
