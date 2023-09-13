package com.example.Usermanagementapp.DBConfig;

import com.example.Usermanagementapp.Entities.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class Configurations {

    @Bean
    public HashMap<Integer, User> cofigHm(){
        return new HashMap<Integer,User>();
    }
}
