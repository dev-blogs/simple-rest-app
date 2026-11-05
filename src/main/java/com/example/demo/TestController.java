
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "Ok");
    }

    @GetMapping("/test")
    public Map<String, String> test() {
        return Map.of("message", "test");
    }
}

