package com.hb.orderservice;

import com.hb.orderservice.prototypeinsingleton.Singleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.SimpleThreadScope;

@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(OrderServiceApplication.class, args);

		SimpleThreadScope simpleThreadScope = new SimpleThreadScope();
		context.getBeanFactory().registerScope("thread", simpleThreadScope);

		// prototypeinsingleton
		Singleton singleton1 = context.getBean("singleton", Singleton.class);
		Singleton singleton2 = context.getBean("singleton", Singleton.class);
		System.out.println(singleton1.getInstance().hashCode());
		System.out.println(singleton1.getInstance().hashCode());
		System.out.println("-------");
		System.out.println(singleton2.getInstance().hashCode());
		// Obs: prototype bean behaves like singleton. same object returned once injected during initialization of singleton class


	}

}
