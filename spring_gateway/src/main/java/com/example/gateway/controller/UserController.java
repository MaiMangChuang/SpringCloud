package com.example.gateway.controller;

import com.example.gateway.pojo.User;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private AuthenticationManager authenticationManager;






    @PostMapping("/login")
    public String login(@RequestBody User user) {
        //AuthenticationManager authenticate进行用户认证
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(user.getUserName(),user.getPassword());
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);
        //如果认证没通过，给出对应的提示
        if(Objects.isNull(authenticate)){
            return "失败了啊水水水水水，这是brannch01";
        }
        //如果认证通过了，使用userid生成一个jwt jwt存入ResponseResult返回
        return "成功";
    }

    @RequestMapping("/logout")
    public String logout() {
        //获取SecurityContextHolder中的用户id
        return "注销";
    }
}
