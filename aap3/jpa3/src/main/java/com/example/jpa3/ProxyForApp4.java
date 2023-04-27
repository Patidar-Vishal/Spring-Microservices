package com.example.jpa3;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="app4",url="http://localhost:1001")
public interface ProxyForApp4 {
	@RequestMapping("service2")
	public String service2();
}