package version4;

import version4.event.MovieEvent;
import version4.event.MovieListener;

import java.util.ArrayList;
import java.util.List;

public class Movie implements Runnable {

    List<MovieListener> movieListenerList = new ArrayList();

    public void addListener(MovieListener movieListener) {
        this.movieListenerList.add(movieListener);
    }

    public void removeListener(MovieListener movieListener) {
        this.movieListenerList.remove(movieListener);
    }

    public void run() {
        try {
            System.out.println("电影2s后进入精彩部分");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 发布喜剧剧情事件
        publishComedyEvent();

        // 发布感人剧情事件
        publishAffectingEvent();
    }

    public void publishMovieEvent(MovieEvent movieEvent) {
        for (MovieListener movieListener : movieListenerList) {
            movieListener.update(movieEvent);
        }
    }

    private void publishComedyEvent() {
        publishMovieEvent(new MovieEvent(2));
    }

    private void publishAffectingEvent() {
        publishMovieEvent(new MovieEvent(1));
    }
}
