package com.company;

public class Firma {

    public static void main(String[] args) {
//        //pierwszy i drugi generowani z peirwzego pustego knstruktora
//        Pracownik pierwszy = new Pracownik();
//        Pracownik drugi = new Pracownik();
//
//        pierwszy.name="Ziomek";
//        pierwszy.surname="Poziomek";
//        pierwszy.age=18;
//
//        drugi.name="Ziomisław";
//        drugi.surname="Poziomek";
//        drugi.age=28;
//
//        pierwszy.printInfo();
//        drugi.printInfo();

        //pracownik trzeci - generowany przez 2 konstruktor
        Pracownik trzeci = new Pracownik("Ewa", "Mrózek", 18, 1000);
        System.out.println("Pracownik "+" "+ trzeci.name+" "+trzeci.surname+" "+trzeci.age+" "+trzeci.salary);
        trzeci.printInfo();

        //pracownik dyrektor - generowany przez konstruktor dziedziczacy
        Director dyr = new Director("krzysztof","Jarzyna", 99, 1000, 999);
        dyr.printInfo();
        dyr.printDirector();

//pracownik CEO- generowany przez konstruktor dziedziczacy
        CompanyCEO ceo = new CompanyCEO("Pinokio", "Kaczka",99, 10000, 9999, 1);
        ceo.printInfo();
        ceo.printDirector();
        ceo.printCEOInfo();

    }
}
