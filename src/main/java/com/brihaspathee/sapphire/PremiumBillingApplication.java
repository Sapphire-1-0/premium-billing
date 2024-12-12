package com.brihaspathee.sapphire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
// Open Feign annotation to connect with Microservice
@EnableFeignClients
public class PremiumBillingApplication {

    public static void main(String[] args) {
        SpringApplication.run(PremiumBillingApplication.class, args);
    }

}
