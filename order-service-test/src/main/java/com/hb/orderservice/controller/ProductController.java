package com.hb.orderservice.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {

    @GetMapping(value = "/getme")
//    @ResponseBody
    public String get(){
        return "java";
    }
}
