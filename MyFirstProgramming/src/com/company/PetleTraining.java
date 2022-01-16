package com.company;

public class PetleTraining {
    public static void main(String[] args) {
        System.out.println("Pierwsza pętla");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Jestem w pierwszej pętli. Wartość i to: "+i);
        }
        System.out.println("Druga pętla");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Jestem w drugiej pętli. Wartość i to: "+i);
        }
        System.out.println("trzecia pętla");
        int i;
        for (i = 0; i <= 10; i++) {
            System.out.println("Jestem w drugiej pętli. Wartość i to: "+i);
        }
        if(i>5) {
            System.out.println("i jest wieksze od 5 i ma wartość: " + i);
        }
        System.out.println("Koniec programu ");
    }
}
