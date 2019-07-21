package com.yash.preonboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 
 * This is the class from where program execution begin.
 * This class implements interface which is used to prevent CORS issue. 
 */

@SpringBootApplication
public class PreOnboardBootApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(PreOnboardBootApplication.class, args);
	}

/**
 * Default method,belongs to interface WebMvcConfigurer.
 * This method will allow localhost:3000 to access URL "/pdf" at the time of development.
 * 	
 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// TODO Auto-generated method stub
		registry.addMapping("/PDF").allowedOrigins("http://localhost:3000");
		registry.addMapping("/candidateDtls/{emailID}").allowedOrigins("http://localhost:3000");
		registry.addMapping("/updateCndDtls").allowedOrigins("http://localhost:3000");
		registry.addMapping("/sendUserCredentials").allowedOrigins("http://localhost:3000");
		WebMvcConfigurer.super.addCorsMappings(registry);
	}

}
