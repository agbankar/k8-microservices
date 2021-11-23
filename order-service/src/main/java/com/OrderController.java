package com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private static final Logger logger = LogManager.getLogger( OrderController.class);
    @GetMapping("/getOrder/{orderId}")
    public ResponseEntity<Order> getUser(@PathVariable String orderId) {
        logger.info("Got the request in order-service"+orderId);
        Order order = new Order(1, "order");
        return ResponseEntity.ok(order);
    }
}
