package com.rw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rw.entity.User;

public interface UserRepo extends JpaRepository<User,Integer>{
	
}
