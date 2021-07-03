package com.codefresher.service;

import java.util.List;

import com.codefresher.model.Student;

public interface StudentService {
	List<Student> searchStudent(String search);
}
