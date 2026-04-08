package com.example.ss04.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

// Đánh dấu lớp cấu hình
@Configuration
// Đánh dấu mở web mvc
@EnableWebMvc
// Scan
@ComponentScan(basePackages = "com.example.ss04")
public class AppConfig{

    @Bean
    public ViewResolver AppConfig(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
