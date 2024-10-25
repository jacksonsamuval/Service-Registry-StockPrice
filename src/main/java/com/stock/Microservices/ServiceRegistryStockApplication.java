package com.stock.Microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryStockApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryStockApplication.class, args);
	}

}
