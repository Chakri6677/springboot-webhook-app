package com.example.webhook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {

    @GetMapping("/")
    public String home() {
        return "Webhook Application is Running!";
    }

    @PostMapping("/webhook")
    public String receiveWebhook(@RequestBody String payload) {
        return "Webhook received successfully! Payload: " + payload;
    }
}
