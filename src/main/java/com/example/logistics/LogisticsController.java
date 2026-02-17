package com.example.logistics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogisticsController {

    @GetMapping("/")
    public String home() {
        return "🚚 Logistics Service Running Successfully";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
