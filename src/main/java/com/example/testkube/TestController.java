package com.example.testkube;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/version")
    public String version() {
        return "version 2";
    }

    @GetMapping("/actuator/health")
    public boolean health() {
        return true;
    }
}
