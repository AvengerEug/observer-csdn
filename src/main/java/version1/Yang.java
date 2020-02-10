package version1;

public class Yang implements Runnable {

    Movie movie;

    public Yang(Movie movie) {
        this.movie = movie;
    }

    public void run() {
        while(true) {
            if (movie.isWonderful()) {
                System.out.println("小杨在哭泣");
                return;
            }
        }
    }

}
