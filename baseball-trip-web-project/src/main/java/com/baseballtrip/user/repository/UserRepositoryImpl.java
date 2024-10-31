package com.baseballtrip.user.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baseballtrip.user.mapper.UserMapper;

@Repository
public class UserRepositoryImpl implements UserRepository {

	private final UserMapper userMapper;
	
	@Autowired
	public UserRepositoryImpl(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
}
