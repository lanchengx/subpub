package com.example.pubsub.demo;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @ProjectName pubsub
 * @Author: lancx
 * @Date: 2020/4/2 22:27
 * @Description:
 */
@Component
public class SmsListener implements ApplicationListener<OrderEvent> {
    @Override
    public void onApplicationEvent(OrderEvent orderEvent) {
        // 验证同步/异步
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 发送短信
        System.out.println("线程名:" + Thread.currentThread().getName() +" - " + "时间:" + System.currentTimeMillis() +" - "
                + orderEvent.getOrderNo() + "发送短信");
    }
}
