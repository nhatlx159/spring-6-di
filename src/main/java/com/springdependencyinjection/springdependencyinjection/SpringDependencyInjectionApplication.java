package com.springdependencyinjection.springdependencyinjection;

import com.springdependencyinjection.springdependencyinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDependencyInjectionApplication.class, args);
		MyController myController = ctx.getBean(MyController.class);
		System.out.println("In main method");
		System.out.println(myController.sayHello());
	}

}
