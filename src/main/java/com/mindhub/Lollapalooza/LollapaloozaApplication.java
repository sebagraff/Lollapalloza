package com.mindhub.Lollapalooza;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LollapaloozaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LollapaloozaApplication.class, args);
	}
	@Bean
	public CommandLineRunner initData(){

		return(args) -> {

		};
	}
}
