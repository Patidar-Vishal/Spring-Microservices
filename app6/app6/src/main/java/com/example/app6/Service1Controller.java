package com.example.app6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Service1Controller {

	@Autowired
	private ProxyForApp7 proxyForApp7;
	
	@RequestMapping("service1")
	public String service1()
	{
		System.out.println("i am in service1 ");
		String results = proxyForApp7.service2();
		return "i am from service 1-" + results;
	}
}
