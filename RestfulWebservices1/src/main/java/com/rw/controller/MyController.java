package com.rw.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rw.entity.User;
import com.rw.myService.UserService;

@RestController
public class MyController {

	@Autowired 
	public UserService userService;
	
	@PostMapping("/user")
	public User saveUser1(@RequestBody User user)
	{
		User user1=userService.saveUser(user);
		if(user1!=null)
		{
			return user1;
		}
		return null;
	}
	
	@GetMapping("/user")
	public List<User> getAllUserDetails()
	{
		return userService.getUserDetails();
	}
	
	@GetMapping("/user/{id}")
	public Optional<User> getUserById(@PathVariable int id)
	{
		return userService.getUser(id);
	}
	
	@PutMapping("/user/{id}")
	public User updateMyUser(@PathVariable int id, @RequestBody User user)
	{
		return userService.updateUser(id, user);
	}
	
	@DeleteMapping("/user/{id}")
	public void delete(@PathVariable int id)
	{
		userService.deleteUser(id);
	}
}
