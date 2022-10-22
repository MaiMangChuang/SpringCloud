package com.example.spring_config_client02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class SpringConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringConfigClientApplication.class, args);
    }

}
