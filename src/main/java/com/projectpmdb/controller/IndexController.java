package com.projectpmdb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	Logger logger= LoggerFactory.getLogger(IndexController.class);

	@RequestMapping("/")
	public String index() {
		  return "index";
	}

	
	
}
