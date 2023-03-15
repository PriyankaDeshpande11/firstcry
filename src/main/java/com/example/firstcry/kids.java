package com.example.firstcry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class kids {
    @GetMapping("/kids")
    public String getdata(){
        return"kids online shopping app";
    }

}
