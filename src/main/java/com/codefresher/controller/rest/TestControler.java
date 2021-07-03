package com.codefresher.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codefresher.model.Users;
import com.codefresher.service.UserService;

@RestController
public class TestControler {
	
	@Autowired
	UserService service;
	
	@GetMapping("/users")
	public List<Users> getAllUser() {
		return service.getAllUser();
	}
}
