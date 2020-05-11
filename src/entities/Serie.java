package entities;

import java.util.Comparator;

public class Serie implements Comparator<Serie> {

    private String name;
    private int year;
    private double rating;

    public Serie() {
    }

    public Serie(String name, int year, double rating) {
        this.setName(name);
        this.setYear(year);
        this.setRating(rating);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public int compare(Serie s1, Serie s2) {

        if (s1.getYear() == s2.getYear()) {
            return s1.getRating() > s2.getRating() ? 1 : -1;
        } else {
            return s1.getYear() - s2.getYear();
        }

    }
}
