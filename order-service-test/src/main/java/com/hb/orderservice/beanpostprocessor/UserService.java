package com.hb.orderservice.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * BeanPostProcessor - If you want to implement some custom logic after the Spring container
 * finishes instantiating, configuring, and initializing a bean,
 * you can plug in one or more BeanPostProcessor implementations. So basically the BeanPostProcessor can be used to
 * do custom instantiation logic for several beans whereas the others are defined on a per-bean basis.
 *
 * In most real-world applications, you won't be interacting with them directly.
 * Spring provides 28 implementations out of the box that handle standard functions like
 * autowiring and applying AOP advice. You use them indirectly by using the standard Spring
 * features such as applying validation annotations on a method parameter, which applies MethodValidationPostProcessor,
 * or making method calls @Async, which applies AsyncAnnotationBeanPostProcessor.
 *
 * https://stackoverflow.com/questions/39164058/what-is-the-real-world-use-of-beanpostprocessor-in-spring
 * https://stackoverflow.com/questions/9862127/what-is-the-difference-between-beanpostprocessor-and-init-destroy-method-in-spri
 * 
 */

@Component
public class UserService implements BeanPostProcessor {

    public UserService() {
        System.out.println("constructor");
    }

    @Nullable
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization: "+beanName);
        return bean;
    }

    @Nullable
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization"+beanName);
        return bean;
    }

    @PostConstruct
    public void postCons(){
        System.out.println("postConstruct");
    }

    @PreDestroy
    public void preDes(){
        System.out.println("preDestroy");
    }
}
