package com.example.testkube;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/health")
    public boolean health() {
        return true;
    }

    @GetMapping("/api/version")
    public String version() {
        return "v3";
    }
}
