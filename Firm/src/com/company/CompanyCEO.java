package com.company;

public class CompanyCEO extends Director {
    public int yearBonus;

    public CompanyCEO(String name, String surname, int age, int salary, int bonus, int yearBonus) {
        super(name, surname, age, salary, bonus);
        this.yearBonus=yearBonus;
    }


    public void printCEOInfo(){
        System.out.println(name+" "+surname+" "+age+" "+salary+" "+bonus+" "+yearBonus);
    }
}
