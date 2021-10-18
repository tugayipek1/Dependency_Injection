package com.bocek.api;

import com.bocek.api.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class MyConfig{
    @Primary
    @Bean
    public Print printA(@Qualifier("message2") Message message) {
        return new PrintAImpl(message);
    }

    @Bean
    public Print printB(@Qualifier("message1") Message message) {
        return new PrintBImpl(message);
    }
    @Bean
    public Print printC(@Qualifier("message2") Message message) {
        return new PrintBImpl(message);
    }

    @Bean
    public Message message1(){
        return new MessageImpl();
    }

    @Bean
    public Message message2(){
        return new MessageImpl2();
    }

}









