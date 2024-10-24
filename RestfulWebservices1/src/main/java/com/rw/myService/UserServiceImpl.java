package com.rw.myService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rw.entity.User;
import com.rw.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	

	@Autowired
	private UserRepo userRepo;
	
	public User saveUser(User user)
	{
		return userRepo.save(user);
	}
	
	public List<User> getUserDetails()
	{
		return userRepo.findAll();
	}
	
	public Optional<User> getUser(int id)
	{
		return userRepo.findById(id);
	}
	
	public User updateUser(int id,User user)
	{
		User user1=userRepo.findById(id).orElse(null);
		if(user1!=null)
		{
			return userRepo.save(user);
		}
		return null;
	}

	public void deleteUser(int id)
	{
		userRepo.deleteById(id);
	}
}
