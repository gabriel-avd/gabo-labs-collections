package entities;

public class Movie implements Comparable<Movie> {
    private String name;
    private int year;
    private double rating;

    public Movie(String name, int year, double rating){
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
    public int compareTo(Movie obj) {
        System.out.println(this.getYear() + " - " + obj.getYear() + " = " + (this.getYear() - obj.getYear()));
        return this.getYear() - obj.getYear();
    }
}
