package com.example.pubsub;

import com.example.pubsub.demo.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PubsubApplicationTests {

    @Autowired
    OrderService orderService;

    @Test
    void contextLoads() {
        orderService.saveOrder();
    }

}
