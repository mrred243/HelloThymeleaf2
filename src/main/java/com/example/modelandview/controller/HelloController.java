package com.example.modelandview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class HelloController {
	
	
	@RequestMapping("/hello")
	public String greeting (@RequestParam(name ="location", required = false, defaultValue = "World") String location, @RequestParam String name) {
		return "Welcome to " + location + name;
	}
}
