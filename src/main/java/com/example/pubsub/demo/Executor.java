package com.example.pubsub.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

/**
 * @ProjectName pubsub
 * @Author: lancx
 * @Date: 2020/4/2 23:03
 * @Description: 实现异步处理不阻塞主程序的执行
 */

@Configuration
public class Executor {
    @Configuration
    public class Config {
        @Bean
        public SimpleAsyncTaskExecutor simpleAsyncTaskExecutor() {
            return new SimpleAsyncTaskExecutor();
        }

        @Bean
        public SimpleApplicationEventMulticaster applicationEventMulticaster() {
            SimpleApplicationEventMulticaster simpleApplicationEventMulticaster = new SimpleApplicationEventMulticaster();
            simpleApplicationEventMulticaster.setTaskExecutor(simpleAsyncTaskExecutor());
            return simpleApplicationEventMulticaster;
        }
    }
}
