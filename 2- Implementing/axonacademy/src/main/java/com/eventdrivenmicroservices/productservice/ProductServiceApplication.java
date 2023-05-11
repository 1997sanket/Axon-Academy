package com.eventdrivenmicroservices.productservice;

import com.eventdrivenmicroservices.productservice.command.api.event.ProductCreatedEvent;
import com.eventdrivenmicroservices.productservice.command.api.event.ProductEventsHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

//	@Bean
//	public ProductEventsHandler getProductEventsHandler() {
//		return new ProductEventsHandler();
//	}
}
