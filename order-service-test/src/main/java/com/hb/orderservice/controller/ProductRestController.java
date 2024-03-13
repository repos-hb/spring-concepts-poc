package com.hb.orderservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    // response http status code
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public String save(@RequestBody Order order){
        return order.getId()+" "+order.getItem();
    }
}
