package com.company;

import java.util.ArrayList;
import java.util.List;

public class MyFirstListEX {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Mateusz");
        names.add("Iza");
        names.add("Katarzyna");
        names.add("Wojtek");

        for (int i=0; i<names.size(); i++){
            System.out.println("Imie "+i+" to: "+names.get(i));
        }
        names.remove(1);
        System.out.println("===================");
        for (int i=0; i<names.size(); i++){
            System.out.println("Imie "+i+" to: "+names.get(i));
        }
    }
}
