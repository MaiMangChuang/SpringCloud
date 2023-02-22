package com.example.gateway.config;


import com.example.gateway.pojo.LoginUser;
import com.example.gateway.pojo.User;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //查询用户信息
        User user = new User();
        if(StringUtils.equals("user",username)){
            user.setUserName(username);
            user.setPassword("123");
        }else {
            throw new RuntimeException("用户名或者密码错误");
        }
        List<String> list = new ArrayList<>(Arrays.asList("test","admin"));
        //把数据封装成UserDetails返回
        return new LoginUser(user,list);
    }
}
