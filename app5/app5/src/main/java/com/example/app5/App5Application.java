package com.example.app5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class App5Application {

	public static void main(String[] args) {
		SpringApplication.run(App5Application.class, args);
	}

}
