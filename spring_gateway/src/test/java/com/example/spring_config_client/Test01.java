package com.example.spring_config_client;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class Test01 {

    @Test
   public void TestBCryptPasswordEncoder() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encode = passwordEncoder.encode("123");
        boolean matches = passwordEncoder.matches("123",
                "$2a$10$TUY0TMuVZVyY/mEwZM8ph.DGw4YH8jL81rngcwr0u3wMgoPbGnK5O");


        System.out.println(encode);
        System.out.println(matches);
    }

}
