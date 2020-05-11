package mains;

import entities.Serie;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {
    public static void main(String[] args) {

        ArrayList<Serie> series = new ArrayList();

        series.add(new Serie("13 reasons why", 2017, 6.6));
        series.add(new Serie("Breaking bad", 2013, 7.0));
        series.add(new Serie("Billions", 2017, 5.9));
        series.add(new Serie("Game of Thrones", 2012, 7.6));

        //WAY 1 TO Compare using comparator
        //series.sort(new Serie());

        //WAY 2 TO Compare using comparator
        Collections.sort(series, new Serie());

        for (Serie serie : series) {
            System.out.println(serie.getName() + "\t" +
                    serie.getYear() + "\t" +
                    serie.getRating());
        }

    }
}
