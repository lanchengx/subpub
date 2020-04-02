package com.example.pubsub.demo;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import sun.applet.AppletEvent;
import sun.applet.AppletListener;

/**
 * @ProjectName pubsub
 * @Author: lancx
 * @Date: 2020/4/2 22:14
 * @Description:
 */
// spring 启动时加载数据
// ApplicationListener  是spring 中的发布订阅模式的实现
@Component
public class LoadBefore implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        // 可在项目启动时把需要的产品类型、地址数据等家住在到对应的map , 减少数据库操作
        System.out.println("spring 启动时加在数据库数据，初始化数据等操作");
    }
}
