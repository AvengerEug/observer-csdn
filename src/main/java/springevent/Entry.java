package springevent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springevent.customerevent.CustomerEvent;

public class Entry {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // 触发自定义事件
        context.publishEvent(new CustomerEvent(context));

        //ContextRefreshEvent 不需要手动触发, 在构建spring环境的refresh方法的finishRefresh方法中被触发
        //context.refresh();

        // ContextStartEvent、ContextStopEvent、ContextCloseEvent需要手动调用触发
        context.start();
        context.stop();
        context.close();

    }
}
