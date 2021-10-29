package com.savio.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "classpath:data.properties")
public class SpringboothwApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringboothwApplication.class, args);
	}

}
