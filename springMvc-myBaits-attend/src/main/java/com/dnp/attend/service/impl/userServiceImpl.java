package com.dnp.attend.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dnp.attend.mapper.UserMapper;
import com.dnp.attend.model.User;
import com.dnp.attend.service.UserService;
import com.dnp.attend.vo.PageVo;

@Service("userService")
public class userServiceImpl extends BaseService<User> implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public Map<String, Object> selectAllPage(PageVo pageVo, String search) {
		return null;
	}
}
