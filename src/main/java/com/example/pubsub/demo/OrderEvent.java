package com.example.pubsub.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.stereotype.Component;

/**
 * @ProjectName pubsub
 * @Author: lancx
 * @Date: 2020/4/2 22:19
 * @Description: 订单事件
 */
@Setter
@Getter
public class OrderEvent extends ApplicationEvent {

    private String orderNo;

    public OrderEvent(Object source, String orderNo) {
        super(source);
        this.orderNo = orderNo;
    }
}
