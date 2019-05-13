package com.springexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @RequestMapping("/greet")
    public String greet() {
        return "Greetings from Spring Boot";
    }
}
