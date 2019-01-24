package com.example.testMaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestMavenApplication {

	public static void main(String[] args) {
		System.out.println("Hello World START");
		SpringApplication.run(TestMavenApplication.class, args);
		System.out.println("Hello World END");
	}

}

