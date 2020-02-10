
package version3;

import version3.observer.MovieObserver;

import java.util.ArrayList;
import java.util.List;

public class Movie implements Runnable {

    List<MovieObserver> movieObservers = new ArrayList<MovieObserver>();

    public void addObserver(MovieObserver movieObserver) {
        this.movieObservers.add(movieObserver);
    }

    public void removeObserver(MovieObserver movieObserver) {
        this.movieObservers.remove(movieObserver);
    }

    public void run() {
        try {
            System.out.println("电影2s后播放到精彩部分");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        notifyObservers();
    }

    public void notifyObservers() {
        for (MovieObserver movieObserver : movieObservers) {
            movieObserver.action();
        }
    }

}
