package com.bocek.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.bocek.api")
@SpringBootApplication
public class Main{


    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}