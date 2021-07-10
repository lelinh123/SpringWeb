package com.codefresher.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codefresher.model.LoginModel;
import com.codefresher.model.Users;
import com.codefresher.repository.UserRepository;
import com.codefresher.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public List<Users> getAllUser() {
		List<Users> rs = userRepository.findAll();
		return rs;
	}

	@Override
	public Users insertUser(Users users) {
		// TODO Auto-generated method stub
		return userRepository.save(users);
		// insert into users(username, password, address)
	}

	@Override
	public Users getById(int id) {
		// TODO Auto-generated method stub
//		userRepository.
		return userRepository.findById(id).get();
	}

	@Override
	public Users updateUser(Users user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

	@Override
	public List<Users> searchByUsername(String inputSearch) {
		// TODO Auto-generated method stub
		return userRepository.findByUsernameLike("%" + inputSearch + "%");
	}

	@Override
	public boolean checkLogin(LoginModel loginModel) {
		// TODO Auto-generated method stub
		// check username tồn tại trong db hay không

		String username = loginModel.getUsername();
		Users user = userRepository.findByUsername(username);
		if (user == null) {
			return false;
		}
		// check xem password có đúng không
		if (!loginModel.getPassword().equals(user.getPassword())) {
			return false;
		}
		return true;
	}

	@Override
	public boolean checkExistsUser(String username) {
		// TODO Auto-generated method stub
		if (userRepository.checkExist(username) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public String updateUserApi(Users user) {

		// check exist user
//		boolean check = userRepository.existsById(user.getId());
		Users rs = userRepository.findById(user.getId()).get();
		if (rs == null) {
			return "Wrong user";
		}
		// TODO Auto-generated method stub
		
		rs.setUsername(user.getUsername());
		userRepository.save(rs);
		return "Update success";

	}

	// save update create
	// findALL: get all ,
	// getById
	// deleteById

}
