package com.trading.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.trading.*")
@SpringBootApplication
public class TradingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradingApplication.class, args);
	}

}
