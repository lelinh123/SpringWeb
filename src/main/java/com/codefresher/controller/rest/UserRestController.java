package com.codefresher.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codefresher.model.Users;
import com.codefresher.service.UserService;

@RestController
//@RequestMapping("/api")
public class UserRestController {
	
	
	@Autowired
	UserService service;
	//GET POST PUT DELETE	
	
	//get all user
	@GetMapping("/userLists")
	public List<Users> getAllUser() {	
		List<Users> result = service.getAllUser();
		return result;
	}
	
	
	//get by id use path variable
	@GetMapping("/users/{userId}")
	public Users getById(@PathVariable("userId") int userId) {
		return service.getById(userId);
	}
	
	
	//get by id dung request param
		@GetMapping("/api/user")
		public Users getByParam(@RequestParam(name = "userId") int userId) {
			return service.getById(userId);
		}
	
}
