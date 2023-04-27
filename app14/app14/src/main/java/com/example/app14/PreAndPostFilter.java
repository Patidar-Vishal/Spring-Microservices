package com.example.app14;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Configuration
public class PreAndPostFilter implements GlobalFilter{
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		System.out.println("pre--->");
		Mono<Void> response = chain.filter(exchange);//before this line we can develop any no of pre method and after this line post.
		System.out.println("post--->");
		return response;
	}
}