package lesson8.hw7_8;

import java.util.Date;

public class Movie {
    private final String name;
    private final Date releaseDate;
    private int grade;
    private String genre;

    public Movie(String name,Date releaseDate){
        this.name = name;
        this.releaseDate = releaseDate;
    }

    public static int ratingForOscar(Movie movie){
        if (movie.grade >= 9){
            return movie.grade;
        }
        return movie.grade;
    }
    public boolean isWonOscar(Movie movie){
        int rate =ratingForOscar(movie);
        if (rate >= 9){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return STR."Movie{grade=\{grade}, genre='\{genre}'}";
    }

}
