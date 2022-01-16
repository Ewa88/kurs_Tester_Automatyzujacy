package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ForEachTraining {
    public static void main(String[] args) {
        int[] myArray = {1,3,5,7,11};
        for(int arrayElem : myArray) {
            System.out.println(arrayElem + " ");
        }
        System.out.println("===================");
        List<String> names = new LinkedList<>();
        names.add("Mateusz");
        names.add("Iza");
        names.add("Katarzyna");
        names.add("Wojtek");

        for (String name: names){
            System.out.println(name);
        }
        names.remove(1);
        System.out.println("===================");
        for (String name: names){
            System.out.println(name);
        }

    }
}
