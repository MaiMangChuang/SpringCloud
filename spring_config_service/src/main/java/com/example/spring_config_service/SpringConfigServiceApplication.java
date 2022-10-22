package com.example.spring_config_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringConfigServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringConfigServiceApplication.class, args);
    }

}
