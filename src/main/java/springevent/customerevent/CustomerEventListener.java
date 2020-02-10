package springevent.customerevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomerEventListener implements ApplicationListener<CustomerEvent> {

    public void onApplicationEvent(CustomerEvent event) {
        System.out.println("自定义事件");
    }
}
