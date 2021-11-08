package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private List<LocalDateTime> screeningTimes = new ArrayList<>();

    public Movie(String title, List<LocalDateTime> screeningTimes) {
        this.title = title;
        this.screeningTimes = screeningTimes;
    }

    public String getTitle() {
        return title;
    }

    public List<LocalDateTime> getScreeningTimes() {
        return screeningTimes;
    }
}
