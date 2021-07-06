package com.codefresher.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codefresher.service.StudentService;

@Controller
public class StudentControler {
	@Autowired
	StudentService studentService;
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public String searchByStudent(Model model, @RequestParam(name = "searchInput", required = false) String search) {
		if (search == null) {
			search = "";
		}
		model.addAttribute("result", studentService.searchStudent(search));
		return "searchStudent";	
	}
}
