package com.frank;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringMVC {
	@RequestMapping("/hello")
	public String hello(){
		System.out.println("Hello");
		return "Hello";
	}
}
