package com.codefresher.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.codefresher.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
	@Query(value = "select * from users where username like %?1%", nativeQuery = true)
     List<Users> getByUsername(String search);
	
	//findByUsernameLike
	List<Users> findByUsernameLike(String username);
	
	Users findByUsername(String username);
	
	//
	
	@Query(value = "select count(username) from users where username = ?1", nativeQuery = true)
	int checkExist(String username);
	
	
	
	boolean existsByUsername(String username); 
	//select * from users
	
	@Query(value = "select * from users", nativeQuery = true)
	List<Users> findAll();
}
