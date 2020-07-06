package com.abrolly.api.aimentor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AimentorApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AimentorApiApplication.class, args);
	}

}
