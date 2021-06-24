package com.imcbb.listener;

import com.imcbb.dao.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

/**
 * @author kevin
 */
@Getter
@Setter
@ToString
public class OrderCreatedEvent extends ApplicationEvent {

    private User user;

    @Override
    public Object getSource() {
        return super.getSource();
    }

    public OrderCreatedEvent(Object source, User user) {
        super(source);
        this.user = user;
    }
}
