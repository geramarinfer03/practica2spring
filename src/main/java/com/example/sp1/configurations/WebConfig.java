package com.example.sp1.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.modelmapper.ModelMapper;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.example.sp1")
public class WebConfig {
    @Bean
    public ModelMapper ModelMapper(){
        return new ModelMapper();
    }

}
