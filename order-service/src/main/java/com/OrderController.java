package com;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @GetMapping("/getOrder/{orderId}")
    public ResponseEntity<Order> getUser(@PathVariable String orderId) {
        Order order = new Order(1, "order");
        return ResponseEntity.ok(order);
    }
}
