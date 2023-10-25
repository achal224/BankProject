package com.Employee.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroServiceEmployeeApplication {

	public static void main(String[] args) {
		System.out.println("Welcome");
		SpringApplication.run(MicroServiceEmployeeApplication.class, args);
	}

}
