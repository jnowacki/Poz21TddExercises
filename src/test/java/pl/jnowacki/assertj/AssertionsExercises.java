package pl.jnowacki.assertj;

import org.junit.BeforeClass;
import org.junit.Test;
import pl.jnowacki.model.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class AssertionsExercises {

    private static List<Movie> movies;
    private static List<Movie> awardedMovies;

    @BeforeClass
    public static void setUp() {
        Director director1 = new Director(
                "Clint Eastwood",
                LocalDate.parse("1930-05-31"),
                Gender.MALE);

        Director director2 = new Director(
                "Quentin Tarantino",
                LocalDate.parse("1963-03-27"),
                Gender.MALE);

        Movie movie1 = new Movie(
                LocalDate.parse("1992-01-21"),
                "Reservoir Dogs",
                MovieGenre.ACTION,
                director2,
                Arrays.asList(new Award(1992),
                        new Award(1993)));

        Movie movie2 = new Movie(
                LocalDate.parse("1994-05-21"),
                "Pulp Fiction",
                MovieGenre.ACTION,
                director2,
                Collections.emptyList());

        Movie movie3 = new Movie(
                LocalDate.parse("1990-12-07"),
                "The Rookie",
                MovieGenre.ACTION,
                director1,
                Arrays.asList(new Award(1990)));

        Movie movie4 = new Movie(
                LocalDate.parse("2008-12-12"),
                "Gran Torino",
                MovieGenre.DRAMA,
                director1,
                Arrays.asList(new Award(2008),
                        new Award(2008)));

        Movie movie5 = new Movie(
                LocalDate.parse("2014-11-11"),
                "American Sniper",
                MovieGenre.ACTION,
                director1,
                Collections.emptyList());

        movies = Arrays.asList(movie1, movie2, movie3, movie4, movie5);
        awardedMovies = Arrays.asList(movie1, movie3, movie4);
    }

    //    check if awarded movies collection contains only movies with one or more awards
    @Test
    public void shouldFindOnlyAwardedMoviesInCollection() {

        for(Movie movie: awardedMovies) {
            assertThat(movie.getAwards()).isNotEmpty();
        }

        assertThat(awardedMovies).noneMatch(movie -> movie.getAwards().isEmpty());
    }

    //    check if Clint Eastwood movies won 3 awards
    @Test
    public void test2() {

    }

    //    Check if Quentin Tarantino created any movies before 1950
    @Test
    public void test3() {

    }

    //    Check if Quentin Tarantino won the same amount of awards as Clint Eastwood
    @Test
    public void test4() {

    }

    //    Check if Clint Eastwood created any comedy movies
    @Test
    public void test5() {

    }

    //    Check how many awards won Quentin Tarantino for his documentary movies
    @Test
    public void test6() {

    }
}
