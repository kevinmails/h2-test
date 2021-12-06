package com.imcbb.listener;

import com.imcbb.dao.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author kevin
 */
@Slf4j
@Component
public class UserOrderCreatedListener implements ApplicationListener<OrderCreatedEvent> {

    @Async
    @Override
    public void onApplicationEvent(OrderCreatedEvent orderCreatedEvent) {
        Object source = orderCreatedEvent.getSource();
        User user = orderCreatedEvent.getUser();
        log.info("发布事件源:{}", source);
        log.info("用户通知：您好（{}）,下单啦！订单：{}}", user.getUserName(), user.getOrderNo());

        /**
        * @desc
        * @author kevin
        * @date 2021/12/9 0:01
        * 测试按天滚动日志
        *
        */
        int i = 0;
        while (true){
            i += 1;
            log.info("go go go {} !", i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
