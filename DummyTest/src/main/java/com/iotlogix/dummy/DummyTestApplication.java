package com.iotlogix.dummy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class DummyTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DummyTestApplication.class, args);
	}

}
