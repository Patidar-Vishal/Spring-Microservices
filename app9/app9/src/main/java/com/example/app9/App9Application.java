package com.example.app9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients("com.example.app9")
public class App9Application {

	public static void main(String[] args) {
		SpringApplication.run(App9Application.class, args);
	}

}
