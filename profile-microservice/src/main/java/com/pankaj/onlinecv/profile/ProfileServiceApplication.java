package com.pankaj.onlinecv.profile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProfileServiceApplication {
	private static final Logger LOG = LoggerFactory.getLogger(ProfileServiceApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext springContext = SpringApplication.run(ProfileServiceApplication.class, args);

		String mongoDBHost = springContext.getEnvironment().getProperty("spring.data.mongodb.host");
		String mongoDBPort = springContext.getEnvironment().getProperty("spring.data.mongodb.port");

		LOG.info("Connected to mongoDB: {} : {}", mongoDBHost, mongoDBPort);
	}
}
