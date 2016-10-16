package com.grognak;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloJenkinsController {

    @RequestMapping("/")
    public String home() {
        return "Hello, Jenkins!";
    }
}
