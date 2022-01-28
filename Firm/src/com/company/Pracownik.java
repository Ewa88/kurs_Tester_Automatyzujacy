package com.company;

public class Pracownik {
    public String name;
   public  String surname;
   public int age;
   public int salary;

//    public Pracownik() {
//
//    }

    public Pracownik(String name, String surname, int age, int salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary=salary;

    }

    public void printInfo() {
        System.out.println(name + " " + surname + " " + age+" " + salary);
    }
//    private void printprivateMsg(){
//        System.out.println('Hey it is me!');
//    }
}
