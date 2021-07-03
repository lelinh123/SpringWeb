package com.codefresher.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.codefresher.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	@Query(value = "select * from students where name like %?1%",  nativeQuery = true)
	List<Student> searchByStudentName(String search);
}
