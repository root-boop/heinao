package com.softtron.pinmaologin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages= {"com.softtron"})
public class Init {
	public static void main(String[] args) {
		SpringApplication.run(Init.class, args);
	}
}
