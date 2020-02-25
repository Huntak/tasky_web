package com.tasky.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskyWebApplication implements CommandLineRunner {

	@Value("${application.service.name}")
	private String serviceName;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(serviceName);
	}

	public static void main(String[] args) {
		SpringApplication.run(TaskyWebApplication.class, args);
	}
}
