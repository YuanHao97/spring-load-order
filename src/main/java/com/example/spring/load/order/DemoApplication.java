package com.example.spring.load.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@ServletComponentScan
public class DemoApplication {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(DemoApplication.class);

	public static ConfigurableApplicationContext ac;
	public static void main(String[] args) {
		ac = SpringApplication.run(DemoApplication.class, args);
	}

}
