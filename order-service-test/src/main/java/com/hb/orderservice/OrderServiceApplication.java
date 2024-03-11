package com.hb.orderservice;

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
	}

}
