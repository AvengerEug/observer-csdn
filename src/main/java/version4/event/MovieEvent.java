package version4.event;

public class MovieEvent {

    // 电影播放精彩部分的类型
    // 1. 感人类型
    // 2. 喜剧类型
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public MovieEvent(int type) {
        this.type = type;
    }
}
