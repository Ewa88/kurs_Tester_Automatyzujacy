package com.company;

public class Director extends Pracownik {
    public int bonus;

    public Director(String name, String surname, int age, int salary, int bonus) {
        super(name, surname, age, salary); //uruchamia konstruktor klasy wyzej
        this.bonus=bonus;
    }

    public void printDirector() {
        System.out.println(name + " " + surname + " " + age + " " + salary + " " + bonus);
    }
}
