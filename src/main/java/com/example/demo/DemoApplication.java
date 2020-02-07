package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import com.example.model.Employee;

@SpringBootApplication
@ComponentScan("com.example")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		/*
		 * ApplicationContext
		 * applicationContext=SpringApplication.run(DemoApplication.class, args);
		 * Employee employee=(Employee)applicationContext.getBean("employee");
		 */
		
	}

}
