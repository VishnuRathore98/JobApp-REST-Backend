package com.example.RESTJobApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestJobAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestJobAppApplication.class, args);
        System.out.println("Server started...");
	}
}
