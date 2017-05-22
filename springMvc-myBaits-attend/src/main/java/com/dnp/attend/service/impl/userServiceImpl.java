package com.dnp.attend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dnp.attend.mapper.UserMapper;
import com.dnp.attend.model.User;
import com.dnp.attend.service.UserService;

@Service("userService")
public class userServiceImpl extends BaseService<User> implements UserService {

	@Autowired
	private UserMapper userMapper;
}
