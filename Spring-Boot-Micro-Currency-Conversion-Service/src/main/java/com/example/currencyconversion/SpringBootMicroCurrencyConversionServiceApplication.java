package com.example.currencyconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.example.currencyconversion.proxy")
@EnableDiscoveryClient
public class SpringBootMicroCurrencyConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroCurrencyConversionServiceApplication.class, args);
	}

}
