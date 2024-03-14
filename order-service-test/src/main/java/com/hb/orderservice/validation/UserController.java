package com.hb.orderservice.validation;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @PostMapping("/user/save")
    public void saveUser(@RequestBody @Valid User user){
        // do nothing
    }
}
