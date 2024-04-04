package com.koroliuk.app.spring_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", defaultValue = "World") String name) {
        return String.format("Hello, %s!", name);
    }
}