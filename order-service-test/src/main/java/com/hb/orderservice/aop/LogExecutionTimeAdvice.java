package com.hb.orderservice.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LogExecutionTimeAdvice {

    @Around("@annotation(com.hb.orderservice.aop.LogExecutionTime)")
    public void logExeTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // before
        long startTime = System.currentTimeMillis();
        log.info("AOP: entering LogExecutionTimeAdvice.logExeTime()"+proceedingJoinPoint.getTarget().toString());

        proceedingJoinPoint.proceed();  // executing the method

        // after
        long endTime = System.currentTimeMillis();
        log.info("AOP: exiting LogExecutionTimeAdvice.logExeTime()"+proceedingJoinPoint.getTarget().toString());
        log.info("AOP: execution time "+(endTime-startTime)+proceedingJoinPoint.getTarget().toString());
    }
}
