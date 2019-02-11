package com.example.testMaven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class TestMavenApplication {
	private static final Logger logger = LoggerFactory.getLogger(TestMavenApplication.class);
	
	@Value("${REPORT_HOME}")
	private String REPORT_HOME;
	
	    @RequestMapping("/")
	    public String home() {
	    	logger.info("Hello World home");
	        return " Hello Docker World::"+REPORT_HOME;
	    }
	    
	    @RequestMapping("test")
	    public String test() {
	    	logger.info("Hello World test");
	        return  "Hello Docker test::"+REPORT_HOME;
	    }
	
	public static void main(String[] args) {
		System.out.println("Hello World START");
		logger.info("Hello World START");
		SpringApplication.run(TestMavenApplication.class, args);
		logger.info("Hello World START1");
		System.out.println("Hello World END");
	}

}

