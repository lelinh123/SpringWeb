package com.codefresher.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codefresher.model.Student;
import com.codefresher.repository.StudentRepository;
import com.codefresher.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository repository;

	@Override
	public List<Student> searchStudent(String search) {
		// TODO Auto-generated method stub
		return repository.searchByStudentName(search);
	}

}
