package com.puneet.spring_jenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;

@SpringBootApplication
public class SpringJenkinsApplication {

//	private static final Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Application started ...");
	}

	public static void main(String[] args) {
		logger.info("Application executed ...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
