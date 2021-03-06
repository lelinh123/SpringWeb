package com.codefresher.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
	public String getHome(Model model) {
		model.addAttribute("message", "Hello word");
		return "home";
	}
}
