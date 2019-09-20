package com.example.forex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMicroForexServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroForexServiceApplication.class, args);
	}

}
