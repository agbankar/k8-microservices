/*
package com;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient
public interface OrderServiceProxy {
    @GetMapping("http://order-service-s:8080/orders/getOrder/{id}/")
    //curl --location --request GET 'http://order-service-s:8080/orders/getOrder/1'
    public Object getOrder( @PathVariable("id") String id);
}

 */
