package com.codefresher.controller.web;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codefresher.service.NhanSuService;

@Controller

public class NhanSuWebController {
	@Autowired
	NhanSuService nhanSuService;
	@RequestMapping(value = "/admin")
	public String getAdmin(Model model) {
		model.addAttribute("nhansu", nhanSuService.getAllNhanSu());
		return "admin";
	}
}
