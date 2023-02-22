package com.example.spring_config_client02.clie;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "config-client",path = "/client")
public interface ConnectConfigClie {
    @GetMapping
    public String connect();
}
