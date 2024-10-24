package com.rw.myService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.rw.entity.User;
import com.rw.repository.UserRepo;

public interface UserService {
	
	public User saveUser(User user);
	
	public List<User> getUserDetails();
	
	public Optional<User> getUser(int id);
	
	public User updateUser(int id,User user);
	
	public void deleteUser(int id);

}
