package com.github.palyfight.hellodocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellodockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellodockerApplication.class, args);
		System.out.println("Hello Docker!");
	}

}