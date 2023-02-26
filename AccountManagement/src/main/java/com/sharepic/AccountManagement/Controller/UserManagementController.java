package com.sharepic.AccountManagement.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sharepic")
public class UserManagementController {
	
	@GetMapping("/hello")
	public String HelloWorld()
	{
		System.out.println("Hello World");
		return("Hello World");
	}

}
