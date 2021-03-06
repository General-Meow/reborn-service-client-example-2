package com.example.rebornserviceclientexample2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@SpringBootApplication
@RefreshScope
public class RebornServiceClientExample2Application {

	public static void main(String[] args) {
		SpringApplication.run(RebornServiceClientExample2Application.class, args);
	}

	@Value("${nice.name}")
	private String niceAppName;

	@Value("${spring.config.managed.value:uhoh default value}")
	private String value;

	@GetMapping(path = "/hello")
	public String hello() {
		return "Hello I'm the client v2, with the name: " + niceAppName + " also the cloud config value is: " + this.value;
	}
}
