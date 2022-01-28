package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Movie> movieList = new ArrayList<>();
        List<Director> directorList = new ArrayList<>();
        List<Actor> actorList = new ArrayList<>();

        dataPreparation(movieList, directorList, actorList);

        String menuOption;
        boolean shouldRunLoopAgain = true;
        while (shouldRunLoopAgain) {
            displayMenu();

            Scanner scanner = new Scanner(System.in);
            menuOption = scanner.nextLine();

            switch (menuOption) {
                case "1":
                    //to do dodaj film
                    System.out.println("dodaj film");
                    break;
                case "2":
                    searchMovieByTitle(movieList);
                    break;
                case "3":
                    getAllMoviesForActor(movieList, actorList);
                    break;
                case "4":
                    checkmovieCost(movieList);
                    break;
                case "5":
                    findMoviesAfterDate(movieList);
                    break;
                case "0":
                    //to do wyjdź z programu
                    System.out.println("wyjdź");
                    shouldRunLoopAgain = false;
                    break;
                default:
                    System.out.println("Niepoprawna wartość");
            }
        }

    }

    private static void findMoviesAfterDate(List<Movie> movieList) {
        System.out.println("Podaj rok, póxniej miesiąc a póxniej dzień");
        Scanner scanner4 = new Scanner(System.in);
        int year = scanner4.nextInt();
        int month = scanner4.nextInt();
        int day = scanner4.nextInt();
        LocalDate providedDate = LocalDate.of(year, month, day);
        for (Movie movie : movieList) {
            if (movie.getPremierDate().isAfter(providedDate)) {
                System.out.println(movie.getTitle());
            }
        }
    }

    private static void checkmovieCost(List<Movie> movieList) {
        System.out.println("Podaj tytuł filmu");
        Scanner scanner3 = new Scanner(System.in);
        String searchMovieTitle = scanner3.nextLine();
        for (Movie movie : movieList) {
            if (movie.getTitle().equals(searchMovieTitle)) {
                double movieCost = 0;
                movieCost += movie.getDirector().getSalary();
                for (Actor actor:movie.getActorList()){
                    movieCost += actor.getSalary();
                }
                System.out.println("Koszt filmu to: "+movieCost);
            }
        }
    }

    private static void getAllMoviesForActor(List<Movie> movieList, List<Actor> actorList) {
        System.out.println("Podaj nazwisko aktora");
        Scanner scanner2 = new Scanner(System.in);
        String actorLastName = scanner2.nextLine();
        Actor searchActor=null;
        for (Actor actor: actorList){
            if(actor.getLastName().equals(actorLastName)){
                searchActor = actor;
            }
        }
        for (Movie movie : movieList) {
            try {
                if (movie.getActorList().contains(searchActor)) {
                    System.out.println(movie.getTitle());

                }
            }catch (NullPointerException e){
                System.out.println("aktor o podanym nazwisku nie zostal znaleziony");
            }
        }
    }

    private static void searchMovieByTitle(List<Movie> movieList) {
        System.out.println("Podaj nazwę filmu");
        Scanner scanner1 = new Scanner(System.in);
        String movieName = scanner1.nextLine();
        for (Movie movie : movieList) {
            if (movie.getTitle().equals(movieName)) {
                System.out.println(movie.toString());
            }
        }
    }

    private static void displayMenu() {
        System.out.println("Wybierz z menu:\n" +
                "1. Dodaj film \n" +
                "2. Szukaj filmu po nazwie \n" +
                "3. Sprawdź w jakich filmach gral dany aktor \n" +
                "4. Sprawdź koszt wyprodukowania filmu \n" +
                "5. Znajdź filmy od okreslonego roku \n" +
                "0. Wyjdź z programu\n");
    }

    private static void dataPreparation(List<Movie> movieList, List<Director> directorList, List<Actor> actorList) {
        Director jamesCameron = new Director("James", "Cameron", 1000, true);
        directorList.add(jamesCameron);

        Director stevenSpielberg = new Director("Steven", "Spielberg", 2000, false);
        directorList.add(stevenSpielberg);

        Actor kateWinslet = new Actor("Kate", "Winslet", 600, SexEnum.female);
        actorList.add(kateWinslet);

        Actor sylvesterStalone = new Actor("Sylvester", "Stalone", 400, SexEnum.male);
        actorList.add(kateWinslet);

        Actor leonardoDiCaprio = new Actor("Leonardo", "DiCaprio", 500, SexEnum.male);
        actorList.add(leonardoDiCaprio);

        Movie titanic = new Movie("Titanic", jamesCameron, List.of(leonardoDiCaprio, kateWinslet), LocalDate.of(1999, 10, 21), MovieTypeEnum.romantic);
        movieList.add(titanic);

        Movie rambo = new Movie("Rambo", stevenSpielberg, List.of(sylvesterStalone, kateWinslet), LocalDate.of(2010, 07, 04), MovieTypeEnum.action);
        movieList.add(rambo);
    }
}
