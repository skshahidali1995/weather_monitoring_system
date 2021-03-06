package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.weather"})
@SpringBootApplication
public class WeatherMonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherMonitoringApplication.class, args);
		System.out.println("Application started");
	}

}
