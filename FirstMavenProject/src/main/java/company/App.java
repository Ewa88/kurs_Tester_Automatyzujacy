package company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        List<Movie> movieList = new ArrayList<>();
        List<Director> directorList = new ArrayList<>();
        List<Actor> actorList = new ArrayList<>();

        // dataPreparation(movieList, directorList, actorList);


    }

    public static void findMoviesAfterDate(List<Movie> movieList) {
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

    public static void checkmovieCost(List<Movie> movieList) {
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

    public static List<Movie> getAllMoviesForActor(List<Movie> movieList, List<Actor> actorList, String actorLastName) {
        List<Movie> moviesForSearchActor = new ArrayList<>();
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
                    moviesForSearchActor.add(movie);

                }
            }catch (NullPointerException e){
                System.out.println("aktor o podanym nazwisku nie zostal znaleziony");
            }
        }
        return moviesForSearchActor;
    }

    public static Movie searchMovieByTitle(List<Movie> movieList, String movieName) {
        for (Movie movie : movieList) {
            if (movie.getTitle().equals(movieName)) {
                return movie;
            }
        }
        return null;
    }


}
