package com.baseballtrip.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baseballtrip.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
}
