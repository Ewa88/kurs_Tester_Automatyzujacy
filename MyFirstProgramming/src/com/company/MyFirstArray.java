package com.company;

public class MyFirstArray {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        numbers[0]=7;
        numbers[1]=2;
        numbers[2]=3;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);


        //nowa tablica
        int[] numbers2 = new int[10];
        for (int i=0; i< numbers2.length; i++){
            numbers2[i] = i*2;
        }
        for (int i=0; i<numbers2.length; i++){
            System.out.println("liczba tablicy stojaca na indeksie" +i+ " jest równa: "+numbers2[i]);
        }

    }
}
