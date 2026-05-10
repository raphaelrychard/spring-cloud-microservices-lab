package com.raphaelrychard.service.tasks;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @Value("${message:Hello Word}")
    private String message;

    @GetMapping("/message")
    public String getMessage() {
        return this.message;
    }
}
