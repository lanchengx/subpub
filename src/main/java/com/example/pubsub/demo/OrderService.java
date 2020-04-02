package com.example.pubsub.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * @ProjectName pubsub
 * @Author: lancx
 * @Date: 2020/4/2 22:08
 * @Description:
 */
@Service
public class OrderService {

    @Autowired
    ApplicationContext applicationContext;

    public void saveOrder(){
        OrderPO orderPO = new OrderPO();
        orderPO.setId(999L);
        System.out.println("时间:" + System.currentTimeMillis() + " - " + "start");
        // todo 主要职责： 传教订单
        // 1、 减库存
        System.out.println("时间:" + System.currentTimeMillis() +" - " + "减库存");
        // 2、 创建订单
        System.out.println("时间:" + System.currentTimeMillis() + " - " + "创建订单");

        // 事件发布，触发相关的监听器
        OrderEvent orderEvent = new OrderEvent(orderPO , "OD202004021252");
        applicationContext.publishEvent(orderEvent);
        System.out.println("时间:" + System.currentTimeMillis() + " - " + "end");

        /**
         * 事件监听的本质其实为for循环调用方法，
         * 默认调用方式分为同步调用， 可注入线程池实现异步调用
         */

//        // 3、 发送短信通知
//        System.out.println("发送短信通知");
//        // 4、 发送微信通知
//        System.out.println("发送微信通知");
//        // ........
//        System.out.println("后续流程");
    }

}
