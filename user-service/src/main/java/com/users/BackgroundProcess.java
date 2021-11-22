package com.users;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BackgroundProcess implements CommandLineRunner {
    private static final Logger logger = LogManager.getLogger( UserController.class);

    @Override
    public void run(String... args) throws Exception {
        for (int i = 1; i >0; i++) {
            Thread.sleep(1*1000);
            logger.info("Hello"+i);

        }

    }
}
