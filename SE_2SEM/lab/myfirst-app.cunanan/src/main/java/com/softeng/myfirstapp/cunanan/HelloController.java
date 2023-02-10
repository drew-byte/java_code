package com.softeng.myfirstapp.cunanan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String greet(){
        return "Hello, Springboot! Andrew Felix Cunanan!";
    }

}
