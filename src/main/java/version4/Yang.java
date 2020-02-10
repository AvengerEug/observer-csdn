package version4;

import version4.event.MovieEvent;
import version4.event.MovieListener;

public class Yang implements MovieListener<MovieEvent> {

    public void update(MovieEvent movieEvent) {
        switch (movieEvent.getType()) {
            case 1:
                System.out.println("感人类型，小杨哭泣");
                break;
            case 2:
                System.out.println("喜剧类型，小杨哈哈大笑");
                break;
            default:
                System.out.println("不做任何事情");
                break;
        }
    }
}
