
package com.users;


import org.springframework.web.client.RestTemplate;


public class OrderServiceProxy {
   // @GetMapping("http://order-service-s:8080/orders/getOrder/{id}/")
    //curl --location --request GET 'http://order-service-s:8080/orders/getOrder/1'
    public static Order getOrder(  int id){
        RestTemplate restTemplate=new RestTemplate();
       return restTemplate.getForObject("http://order-service-s:8080/orders/getOrder/1", Order.class);

    }

}


