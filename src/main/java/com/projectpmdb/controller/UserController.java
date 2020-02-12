package com.projectpmdb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	
	@RequestMapping("/user")
	public String index() {
		return "pages/tables/user";
		
	}
	
	@RequestMapping("/user/add")
	public String add() {
		return "pages/forms/user";
	}
}
