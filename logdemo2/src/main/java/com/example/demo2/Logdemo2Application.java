package com.example.demo2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Logdemo2Application {

	// logger, constructor
    private static Logger logger = LoggerFactory.getLogger(Logdemo2Application.class);
    private String INFO_MSG_FORMAT = "(application=logdemo2) >> {}={}";
    
	public static void main(String[] args) {
		SpringApplication.run(Logdemo2Application.class, args);
	}

	@RequestMapping("/")
    public String home() {
		logger.info(INFO_MSG_FORMAT, "message", "<xml>Hello Log Demo2</xml>");
        return "Hello Log Demo2";
    }
}

