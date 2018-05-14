package com.example.rebornserviceclientexample2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@SpringBootApplication
public class RebornServiceClientExample2Application {

	public static void main(String[] args) {
		SpringApplication.run(RebornServiceClientExample2Application.class, args);
	}
}
