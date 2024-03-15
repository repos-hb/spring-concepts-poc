package com.hb.orderservice.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AopDemoController {

    @GetMapping("/aop/1")
    public void one(){
        log.info("AOP: inside AopDemoController.one()");
    }

    @GetMapping("/aop/2")
    public void two(){
        log.info("AOP: inside AopDemoController.two()");
        throw new RuntimeException("aop test");
    }

    @LogExecutionTime
    @GetMapping("/aop/3")
    public void three() throws InterruptedException {
        log.info("AOP: inside AopDemoController.three()");
        Thread.sleep(1000);
    }

    @LogPayloads
    @GetMapping("/aop/4")
    public void four() throws InterruptedException {
        log.info("AOP: inside AopDemoController.four()");
    }
}
