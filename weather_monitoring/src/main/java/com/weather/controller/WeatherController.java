package com.weather.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
	
	
	@RequestMapping("/home")
	@ResponseBody
	public static String home() {
		String tmp = "abc";
		return "server running "+tmp;
	}
}
 //responseentity