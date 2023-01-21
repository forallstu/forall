package com.example.with;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class WithapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WithapiApplication.class, args);
	}

}
