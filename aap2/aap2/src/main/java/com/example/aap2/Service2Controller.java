package com.example.aap2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Service2Controller {

	@RequestMapping("service2")
	public String service1() {
		System.out.println("from service2");
		return "from service2 ";
	}
}
