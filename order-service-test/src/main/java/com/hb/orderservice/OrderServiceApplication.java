package com.hb.orderservice;

import com.hb.orderservice.prototypeinsingleton.Singleton;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.SimpleThreadScope;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class OrderServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {

		System.out.println("SpringApplication run()........executed");
		ConfigurableApplicationContext context = SpringApplication.run(OrderServiceApplication.class, args);

		SimpleThreadScope simpleThreadScope = new SimpleThreadScope();
		context.getBeanFactory().registerScope("thread", simpleThreadScope);

		// prototypeinsingleton
//		Singleton singleton1 = context.getBean("singleton", Singleton.class);
//		Singleton singleton2 = context.getBean("singleton", Singleton.class);
//		System.out.println(singleton1.getInstance().hashCode());
//		System.out.println(singleton1.getInstance().hashCode());
//		System.out.println("-------");
//		System.out.println(singleton2.getInstance().hashCode());
		// Obs: prototype bean behaves like singleton. same object returned once injected during initialization of singleton class


	}

	/**
	 * Command-line runners are a useful functionality to execute the various types of code that only have to be run once, right after application startup.
	 * Multiple CommandLineRunner beans can be defined within the same application context and can be ordered using the Ordered interface or @Order annotation.
	 */
	@Order(value = 1)
	@Override
	public void run(String... args) throws Exception {
		// db connection
		// feeding data to db
		// any post startup logic can be executed
		System.out.println("CommandLineRunner run()........executed");
	}
}
