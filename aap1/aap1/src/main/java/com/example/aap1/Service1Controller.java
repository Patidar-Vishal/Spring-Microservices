package com.example.aap1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Service1Controller {
	
	@RequestMapping("service1")
	public String service1() {
		System.out.println("from service1");
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> responseEntity = 
				rt.getForEntity("http://localhost:3000/service2", String.class);
		String result = responseEntity.getBody();
		return "from service1"+ result;
	} 
}
