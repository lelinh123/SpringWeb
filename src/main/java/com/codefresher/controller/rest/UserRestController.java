package com.codefresher.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codefresher.model.Users;
import com.codefresher.service.UserService;

@RestController
@RequestMapping("/api")
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
		@GetMapping("/users")
		public Users getByParam(@RequestParam(name = "userId") int userId) {
			return service.getById(userId);
		}
		
		@GetMapping("/searchUser")
		public ResponseEntity<List<Users>> searchUserByUsername(@RequestParam(name = "searchInput") String searchInput) {
			List<Users> rs = service.searchByUsername(searchInput);
			return new ResponseEntity(rs, HttpStatus.OK);
		}
		
		
	//post
		
		@PostMapping("/users")
		public ResponseEntity<Users> insertUser(@RequestBody Users user) {
			Users rs = service.insertUser(user);
			return new ResponseEntity<Users>(rs, HttpStatus.OK);
		}
		
		//put
		@PutMapping("/users")
		public String updateUser(@RequestBody Users user) {
			return service.updateUserApi(user);
		}
		
		//delete
		@DeleteMapping("/users")
		public String deleteUser(@RequestParam("id") int id ) {
			service.deleteUser(id);
			return "Success";
		}
}
