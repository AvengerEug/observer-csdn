package version4;

public class Application {

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.addListener(new Huang());
        movie.addListener(new Yang());

        Thread thread = new Thread(movie);
        thread.start();
    }
}
