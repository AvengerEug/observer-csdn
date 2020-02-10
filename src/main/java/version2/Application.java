package version2;

public class Application {

    public static void main(String[] args) {
        Thread thread = new Thread(new Movie(new Yang(), new Huang()));
        thread.start();
    }
}
