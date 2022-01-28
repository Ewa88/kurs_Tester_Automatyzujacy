import company.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static company.App.getAllMoviesForActor;
import static company.App.searchMovieByTitle;

public class MovieDBTest {
    List<Movie> movieList = new ArrayList<>();
    List<Director> directorList = new ArrayList<>();
    List<Actor> actorList = new ArrayList<>();

    @BeforeClass
    public void dataPreparation() {
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

    @Test
    public void shouldFindMovieByTitle(){
        Movie movie = searchMovieByTitle(movieList, "Titanic");
        Assert.assertNotNull(movie);
    }

    @Test
    public void shouldNotFindMovieByTitle(){
        Movie movie = searchMovieByTitle(movieList, "Titanic1");
        Assert.assertNull(movie);
    }

    @Test
    public void shouldFindAllMoviesForActor(){
        List<Movie> allMoviesForActor = getAllMoviesForActor(movieList, actorList, "Winslet");
        Assert.assertEquals(allMoviesForActor.size(), movieList.size());
    }
    @Test
    public void shouldNotFindAllmoviesForActor(){
        List<Movie> allMoviesForActor = getAllMoviesForActor(movieList, actorList, "Winslet1");
        Assert.assertTrue(allMoviesForActor.size()==0);
    }

}
