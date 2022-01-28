package com.company;

public class Main {

    public static void main(String[] args) {
        Car bmw = new Car();
        Car audi = new Car();

        bmw.drive();
        audi.drive();

        System.out.println(bmw.color);
        System.out.println(audi.color);

        bmw.color="blue";
        System.out.println(bmw.color);
        System.out.println(audi.color);
        // Car.doSomething(); // metody statyczne mozna tak uruchomic
        // Car.drive(); --> tak nie zadziala bo drive nie jest statyczna, takie niestatyczne sa w obrebie obiektu klasy
    }
}
