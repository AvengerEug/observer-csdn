package version1;

public class Application {

    public static void main(String[] args) {
        Movie movie = new Movie();
        Thread threadMovie = new Thread(movie);
        threadMovie.start();

        Thread threadHuang = new Thread(new Huang(movie));
        threadHuang.start();

        Thread threadYang = new Thread(new Yang(movie));
        threadYang.start();
    }
}
