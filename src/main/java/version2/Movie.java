package version2;

public class Movie implements Runnable {

    Yang yang;
    Huang huang;

    public Movie(Yang yang, Huang huang) {
        this.yang = yang;
        this.huang = huang;
    }

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("电影播放到精彩部分");
        notifyObservers();
    }

    public void notifyObservers() {
        yang.cry();
        huang.sleep();
    }


}
