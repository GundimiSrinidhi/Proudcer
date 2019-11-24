package com.example.demo;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

@SpringBootApplication
public class ConsumerApplication {

	public static void main(String[] args) throws RestClientException, IOException {
		ApplicationContext ac=SpringApplication.run(ConsumerApplication.class, args);
		
		ConsumerClient ci=(ConsumerClient) ac.getBean(ConsumerClient.class);
		ci.getEmp();
	}

	@Bean
	public ConsumerClient getConsumerClient()
	{
		return new ConsumerClient();
	}
	
	
	
}
