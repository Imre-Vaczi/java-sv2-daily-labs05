package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Movie> movieList = new ArrayList<>();


    public void addMovie(Movie movie){
        this.movieList.add(movie);
        
    }

    public List<String> findMovieByTime(LocalDateTime time){
        List<String> result = new ArrayList<>();
        for (Movie film : movieList){
            for (LocalDateTime occasion : film.getScreeningTimes()){
                if (occasion.isEqual(time)){
                    result.add(film.getTitle());
                }
            }
        }
        return result;
    }
}
