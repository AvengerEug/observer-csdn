package version1;

public class Huang implements Runnable {

    Movie movie;

    public Huang(Movie movie) {
        this.movie = movie;
    }

    public void run() {
        while(true) {
            if (movie.isWonderful()) {
                System.out.println("小黄在睡觉");
                return;
            }
        }
    }
}
