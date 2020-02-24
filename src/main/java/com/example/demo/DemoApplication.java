package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("hello  world");
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping("/hello")
	public String  helloWord(@RequestParam(value = "name",defaultValue = "word") String name) {
		return String.format("hello %s", name);
	}

}
