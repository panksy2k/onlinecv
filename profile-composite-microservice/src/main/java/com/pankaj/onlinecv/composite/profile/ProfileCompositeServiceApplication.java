package com.pankaj.onlinecv.composite.profile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProfileCompositeServiceApplication {
	private static final Logger LOG = LoggerFactory.getLogger(ProfileCompositeServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProfileCompositeServiceApplication.class, args);
	}
}
