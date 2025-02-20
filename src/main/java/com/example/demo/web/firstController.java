 package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class firstController {
	@GetMapping("/welcome")
	public ModelAndView display() {
		ModelAndView md=new ModelAndView();
		
		md.addObject("message", "welcome to to real part");
		md.setViewName("index");
		return md;
		
		
	}

}
