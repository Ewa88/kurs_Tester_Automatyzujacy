package com.company;

public class WhileTraining {
    public static void main(String[] args) {

       //while
        int licznik = 0;
        while (licznik < 10) {
            System.out.println("to jest petla");
            licznik++;
        }
        System.out.println("koniec petli");

        //do while - min raz sie wykona nawet jak warunek nie spelniony
       // licznik=0;
        do{
            System.out.println("licznik:"+licznik);
            System.out.println("petla do while");
            licznik++;
        }
        while(licznik<5);
    }
}

