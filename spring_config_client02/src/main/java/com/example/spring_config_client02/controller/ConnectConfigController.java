package com.example.spring_config_client02.controller;

import com.example.spring_config_client02.clie.ConnectConfigClie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client2")
public class ConnectConfigController {
    @Autowired
    ConnectConfigClie connectConfigClie;

    @GetMapping
    public String connect(){
       return connectConfigClie.connect();
    }

    @GetMapping("/all")
    public String all(){
        return "all client2";
    }
}
