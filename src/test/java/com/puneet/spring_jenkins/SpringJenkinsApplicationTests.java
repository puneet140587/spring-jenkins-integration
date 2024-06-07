package com.puneet.spring_jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringJenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger("SpringJenkinsApplicationTests") ;

	@Test
	void contextLoads() {
	logger.info("Test Case Executing ....");
		assertEquals("true","true") ;
		logger.info("Test case execution completed");
	}

}
