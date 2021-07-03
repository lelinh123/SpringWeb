package com.codefresher.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codefresher.model.Users;
import com.codefresher.model.pojo.UserDTO;
import com.codefresher.service.UserService;

@RestController
@RequestMapping("/api")
public class UserRestController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/user/{id}")
	public ResponseEntity<Users> getUSerById(@PathVariable("id") int id) {
		
		
//		Users rs = service.getById(id);
//		UserDTO userDto = new UserDTO();
//		userDto.setId(rs.getId());
//		userDto.setUsername(rs.getUsername());
		return new ResponseEntity<Users>(service.getById(id), HttpStatus.OK);
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<Users>> getAllUser() {
		return new ResponseEntity<List<Users>>(service.getAllUser(), HttpStatus.OK);
	}

}
