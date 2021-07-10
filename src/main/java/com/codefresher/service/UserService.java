package com.codefresher.service;

import java.util.List;

import com.codefresher.model.LoginModel;
import com.codefresher.model.Users;

public interface UserService {
	//get all user
	List<Users> getAllUser();
	
	Users insertUser(Users users);
	//getByID
	Users getById(int id);
	//update user
	Users updateUser(Users user);
	
	//deleteUser
	void deleteUser(int id);
	
	//search by username
	List<Users> searchByUsername(String inputSearch);
	
	boolean checkLogin(LoginModel loginModel);
	
	//check exiset user
	boolean checkExistsUser(String username);
	
	String updateUserApi(Users user);
}
