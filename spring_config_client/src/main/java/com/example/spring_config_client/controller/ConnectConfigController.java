package com.example.spring_config_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ConnectConfigController {
    @Value("${file.name}")
     String name;
    @Value("${file.age}")
    String age;

    @GetMapping
    public String connect(){
     return name.concat(age);
//        return "访问了client";
    }
}
