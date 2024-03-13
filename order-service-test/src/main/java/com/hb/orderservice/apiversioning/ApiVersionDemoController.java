package com.hb.orderservice.apiversioning;

import com.hb.orderservice.controller.Order;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiVersionDemoController {

    /**
     * example of Path URI based versioning
     */
    @PostMapping("/v1/save")
    public String save(){
        // old code
        return "OK";
    }

    @PostMapping("/v2/save")
    public String save2(){
        // latest business logic
        return "OK";
    }

    /**
     * example of Request Param based versioning
     */
    @PostMapping("/v3/save")
    public String save3(@RequestBody Order order, @RequestParam("version") int version){
        if(1==version){
            // call some method
            return "OK";
        } else if (2==version){
            // call some other method
            return "OK";
        }
        return "RETRY";
    }

    /**
     * example of Request Header based versioning
     */
    @PostMapping("/v4/save")
    public String save4(@RequestBody Order order, @RequestHeader("api-version") int version){
        if(1==version){
            // call some method
            return "OK";
        } else if (2==version){
            // call some other method
            return "OK";
        }
        return "RETRY";
    }
}
