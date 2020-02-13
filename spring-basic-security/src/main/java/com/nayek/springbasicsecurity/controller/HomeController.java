package com.nayek.springbasicsecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	
	@RequestMapping(value="/hello",method = RequestMethod.GET)
	public String helloWorld()
	{
		
		return "Hello , This is Spring Security Demo";
	}
	
	
	@RequestMapping(value="/hellosecurity" , method = RequestMethod.GET)
	public String HelloSecurity()
	{
		return "Welcome you have accessed an authenticated resource";
	}
}
