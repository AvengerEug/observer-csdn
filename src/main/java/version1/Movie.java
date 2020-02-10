package version1;

public class Movie implements Runnable {

    private volatile boolean isWonderful;

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("电影播放到精彩部分");
        wonderfulPart();
    }

    private void wonderfulPart() {
        this.setWonderful(true);
    }

    public boolean isWonderful() {
        return isWonderful;
    }

    public void setWonderful(boolean wonderful) {
        isWonderful = wonderful;
    }
}
