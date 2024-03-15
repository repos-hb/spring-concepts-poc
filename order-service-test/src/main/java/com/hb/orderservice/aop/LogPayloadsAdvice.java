package com.hb.orderservice.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LogPayloadsAdvice {

    @Around("@annotation(com.hb.orderservice.aop.LogPayloads)")
    public void logPayloads(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        log.info("AOP: entering LogPayloadsAdvice.logPayloads()"+proceedingJoinPoint.getTarget().toString());
        proceedingJoinPoint.proceed();
        log.info("AOP: exiting LogPayloadsAdvice.logPayloads()"+proceedingJoinPoint.getTarget().toString());
    }
}
