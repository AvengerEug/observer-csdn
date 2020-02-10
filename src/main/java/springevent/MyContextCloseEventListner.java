package springevent;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

@Component
public class MyContextCloseEventListner implements ApplicationListener<ContextClosedEvent> {

    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("Context close event log");
    }
}
