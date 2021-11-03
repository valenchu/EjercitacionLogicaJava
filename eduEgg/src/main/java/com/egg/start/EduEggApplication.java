package com.egg.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EduEggApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduEggApplication.class, args);
	}

}
