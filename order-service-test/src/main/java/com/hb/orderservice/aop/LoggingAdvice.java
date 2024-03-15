package com.hb.orderservice.aop;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAdvice {

    /**
     * A pointcut declaration has two parts: a signature comprising a name and any parameters,
     * and a pointcut expression that determines exactly which method executions we are interested in.
     */
//    @Pointcut("execution(* com.hb.orderservice.aop.AopDemoController.*(..))")   // the pointcut expression
//    public void loggingAdvice(){        // the pointcut signature
//    }

    @Before("execution(* com.hb.orderservice.aop.AopDemoController.*(..))")     // the pointcut expression
    public void beforeAdvice(JoinPoint joinPoint) throws JsonProcessingException {  // the pointcut signature
        log.info("AOP: inside LoggingAdvice.beforeAdvice()");
        log.info("Before Advice - class name {} ,method name {} ", joinPoint.getTarget(), joinPoint.getSignature().getName());
        log.info("Before Advice - Request Body {} ", new ObjectMapper().writeValueAsString(joinPoint.getArgs()));
    }

    @AfterReturning("execution(* com.hb.orderservice.aop.AopDemoController.*(..))")
    public void afterReturning(JoinPoint joinPoint){
        log.info("AOP: inside LoggingAdvice.afterReturning()");
    }

    @AfterThrowing("execution(* com.hb.orderservice.aop.AopDemoController.*(..))")
    public void afterThrowing(JoinPoint joinPoint){
        log.info("AOP: inside LoggingAdvice.afterThrowing()");
    }

    @After("execution(* com.hb.orderservice.aop.AopDemoController.*(..))")
    public void afterAdvice(JoinPoint joinPoint){
        log.info("AOP: inside LoggingAdvice.afterAdvice()");
    }
}
