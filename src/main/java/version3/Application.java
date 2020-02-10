package version3;

public class Application {

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.addObserver(new Yang());
        movie.addObserver(new Huang());

        Thread thread = new Thread(movie);
        thread.start();

    }
}
