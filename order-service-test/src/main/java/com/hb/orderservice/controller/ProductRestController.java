package com.hb.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {
    @GetMapping("/getme2")
    public String get(){
        return "java";
    }
}
