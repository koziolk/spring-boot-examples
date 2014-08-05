package com.roche.spring.boot.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class HelloConfiguration {
	
	public static void main(String[] args) {
		SpringApplication.run(HelloConfiguration.class, args);
	}
	
}


// mvn package && java -jar target\demo1-0.0.1-SNAPSHOT.jar