package com.example.demo;

import com.example.demo.model.Coder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		Coder c1 = context.getBean(Coder.class);
		c1.name = "Saqib";
		System.out.println(c1.name);

		Coder c2 = context.getBean(Coder.class);
		System.out.println(c2.name);
	}

}
