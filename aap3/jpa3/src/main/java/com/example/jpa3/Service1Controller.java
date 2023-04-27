package com.example.jpa3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Service1Controller {
	
	@Autowired
	private ProxyForApp4 proxyForApp4;
	@RequestMapping("service1")
	public String service1()
	{
		System.out.println("i am in service1 ");
		String results = proxyForApp4.service2();
		return "i am from service 1-" + results;
	}
}
