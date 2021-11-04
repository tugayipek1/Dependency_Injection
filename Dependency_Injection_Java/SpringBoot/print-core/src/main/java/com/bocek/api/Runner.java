package com.bocek.api;

import com.bocek.api.PrintAImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private Print print;

    @Override
    public void run(String... args) throws Exception {
        print.print();
    }
}