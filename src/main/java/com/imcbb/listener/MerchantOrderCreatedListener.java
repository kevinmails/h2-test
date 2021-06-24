package com.imcbb.listener;

import com.imcbb.dao.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author kevin
 * <p>
 * 监控用户下单，通知商户<br/>
 * 添加{@link EventListener}注解，代替实现{@link org.springframework.context.ApplicationListener}接口
 */
@Slf4j
@Component
public class MerchantOrderCreatedListener {

    @Async
    @EventListener(OrderCreatedEvent.class)
    public void onApplicationEvent(OrderCreatedEvent orderCreatedEvent) {
        Object source = orderCreatedEvent.getSource();
        User user = orderCreatedEvent.getUser();
        log.info("发布事件源 :{}", source);
        log.info("商家接到通知：用户（{}）,下单啦！订单：{}}", user.getUserName(), user.getOrderNo());

    }
}
