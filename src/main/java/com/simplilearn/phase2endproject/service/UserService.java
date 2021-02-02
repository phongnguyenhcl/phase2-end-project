package com.simplilearn.phase2endproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.simplilearn.phase2endproject.model.User;
import com.simplilearn.phase2endproject.repository.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	UserRepository userRepo;
	
	public List<User> listAll() {
		return userRepo.findAll();
	}
	
	public void saveUser(User newUser) {
		userRepo.save(newUser);
	}
	
	public User findUserByName(String userName) {;
		return userRepo.findByUsername(userName);
	}
}
