package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class AdvancedOauth2RedisLogoutApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvancedOauth2RedisLogoutApplication.class, args);
	}

}
