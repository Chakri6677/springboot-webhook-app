package com.example.webhook;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements CommandLineRunner {

    @Override
    public void run(String... args) {
        System.out.println("Webhook application has started successfully!");
    }
}
