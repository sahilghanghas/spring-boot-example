package com.rest.restexample;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

    @RequestMapping("/greet")
    public String start() {
        return "Jetty started";
    }
}
