package com.users;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private static final Logger logger = LogManager.getLogger( UserController.class);

    @GetMapping("/getUser/{id}")
    public ResponseEntity<User> getUser(@PathVariable String id) {
        logger.debug("Ashish");
        logger.info("Ashish");

        //Order order = OrderServiceProxy.getOrder(1);
        //System.out.println("order object is "+order);

            return ResponseEntity.ok(new User(2,"manish",null));


    }

}
