package com.chandra.SpringBoot_01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
    @GetMapping("/greet")
    public String greetMessage(){
        return "Welcome to Spring Azure DevOps Application";
    }
}
