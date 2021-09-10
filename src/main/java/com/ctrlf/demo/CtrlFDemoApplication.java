package com.ctrlf.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* @Author Yibo Wen
* @Date 9/2/2021 10:14 PM
**/
@SpringBootApplication
public class CtrlFDemoApplication {

	private static final Logger log= LoggerFactory.getLogger(CtrlFDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CtrlFDemoApplication.class, args);
		log.info("Demo has started...");
	}

}
