package com.graph.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ReadServiceApplication extends SpringBootServletInitializer {

	/**
	 * will get executed in jar
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ReadServiceApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ReadServiceApplication.class);
	}
	
	
	
	
}
