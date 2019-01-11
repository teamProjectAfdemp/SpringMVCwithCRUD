package com.candidjava.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.candidjava.spring.bean.User;

@Controller
public class WelcomeController {
	
	
	@GetMapping("index")
	public ModelAndView welcome(User user) {
		return new ModelAndView("welcome");
	}

}
