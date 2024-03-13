package com.hb.orderservice.corsconfig;

import org.springframework.web.bind.annotation.*;

@RestController("/api/")
@CrossOrigin(maxAge = 3600)     // applies to all handler methods.
public class CorsConfigAtControllerLevel {

    @GetMapping
    @CrossOrigin(origins = "http://localhost:8989/")    // handler specific
    public String getme(){
        return "GET";
    }

    @PostMapping
    @CrossOrigin(origins = "http://localhost:8989/")
    public String postme(){
        return "POST";
    }

    @DeleteMapping
    @CrossOrigin(origins = "http://localhost:8009/")
    public Boolean delete(){
        return true;
    }
}
