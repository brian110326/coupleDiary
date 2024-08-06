package com.example.couplediary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CouplediaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouplediaryApplication.class, args);
	}

}
