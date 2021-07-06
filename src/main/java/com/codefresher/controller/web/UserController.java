package com.codefresher.controller.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codefresher.model.LoginModel;
import com.codefresher.model.Users;
import com.codefresher.repository.UserRepository;
import com.codefresher.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;

	@Autowired
	UserRepository repository;
	
//	Resource

	// get all
	@RequestMapping(value = "/listUser", method = RequestMethod.GET)
	public String getAllUser(Model model, @RequestParam(name = "searchInput", required = false) String search) {
		if (search == null) {
			search = "";
		}
		List<Users> rs = userService.searchByUsername(search);
		model.addAttribute("users", rs);
		return "user/listUser";
	}

	// create user
	@RequestMapping(value = "/showAddUser", method = RequestMethod.GET)
	public String showAddUser(Model model) {
		model.addAttribute("userModel", new Users());
		return "addUser";
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String doAddUser(@ModelAttribute(name = "userModel") Users user, Model model) {
		//check username va pw co empty hay khong
		if(user.getUsername() == null || user.getUsername().equals("")) {
			model.addAttribute("errorUsername", "Username can not empty");
			return "addUser";
		}
		//check username da ton tai hay chua
		if (userService.checkExistsUser(user.getUsername())) {
			model.addAttribute("errorUsername", "Username exited");
			return "addUser";
		}
		
		//user chua ton tai -> goi ham user userService.insertUser(user);		
		userService.insertUser(user);
		return "redirect:home";
	}

	// get user by id
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public String getById(Model model, @PathVariable(name = "id") int id) {
		model.addAttribute("user", userService.getById(id));
		return "userDetail";
	}

	// cap nhat mot user
	@RequestMapping(value = "/updateUser/{id}", method = RequestMethod.GET)
	public String showUpdateUser(Model model, @PathVariable("id") int id) {
		model.addAttribute("userModel", userService.getById(id));
		return "updateUser";
	}

	// cap nhat mot user
	@RequestMapping(value = "/updateUser", method = RequestMethod.POST)
	public String updateUser(@ModelAttribute("userModel") Users user) {
		userService.updateUser(user);
		return "redirect:home";
	}

	// delete user
	@RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.GET)
	public String deleteUser(@PathVariable("id") int id) {
		userService.deleteUser(id);
		return "listUser";
	}
	
	@RequestMapping(value = "/showLogin", method = RequestMethod.GET)
	public String showLogin(Model model) {
		model.addAttribute("loginModel", new Users());
		return "login";
	}
	
	@RequestMapping(value = "/doLogin", method = RequestMethod.POST)
	public String doLogin(@ModelAttribute(name = "loginModel") LoginModel loginModel, Model model) {
//		userService.insertUser(user);
		//1.check username va pw co empty hay khong
		
		//1.check username co ton tai trong db hay khong ->pw
		if (!userService.checkLogin(loginModel)) {
			return "redirect:showLogin";
		}
		return "redirect:listUser";
	}
}
