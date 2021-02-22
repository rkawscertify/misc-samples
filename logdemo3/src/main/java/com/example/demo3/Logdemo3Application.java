package com.example.demo3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Logdemo3Application {

	// logger, constructor
    private static Logger logger = LoggerFactory.getLogger(Logdemo3Application.class);
    private String INFO_MSG_FORMAT = "(application=logdemo3) >> {}={}";
    
	public static void main(String[] args) {
		SpringApplication.run(Logdemo3Application.class, args);
	}

	@RequestMapping("/")
    public String home() {
		logger.info(INFO_MSG_FORMAT, "message", "<xml>Hello Log Demo3</xml>");
        return "Hello Log Demo3";
    }
}

