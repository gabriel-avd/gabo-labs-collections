package mains;

import entities.Movie;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("X-men", 2010, 5.5));
        movies.add(new Movie("X-men 3", 2014, 6.5));
        movies.add(new Movie("X-men 2", 2012, 7.5));
        movies.add(new Movie("X-men 4", 2016, 3.5));

        Collections.sort(movies);

        System.out.println("Movies after sorting");

        for (Movie movie : movies) {
            System.out.println(movie.getName() + "\t" +
                    movie.getYear() + "\t" +
                    movie.getRating());
        }
    }
}
