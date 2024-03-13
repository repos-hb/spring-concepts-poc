package com.hb.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {
    @GetMapping(value="/getme2")
    public String get(){
        return "java";
    }

    // demo of content negotiation in spring
    @GetMapping(value="/bing", produces = {"application/json", "application/xml"})
    public Order nego(){
        return new Order(101,"laptop","9999","2","19998");
    }
}
