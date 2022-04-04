package com.mansi.helloworlddemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@RequestMapping(value = "/")
	public String hello() {
		return "Hello World!";
	}
	
	@RequestMapping(value = "home")
	public String home() {
		return "Welcome";
	}
	
}
