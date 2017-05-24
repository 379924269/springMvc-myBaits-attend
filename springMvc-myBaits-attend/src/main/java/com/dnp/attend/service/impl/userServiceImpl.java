package com.dnp.attend.service.impl;

import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dnp.attend.mapper.UserMapper;
import com.dnp.attend.model.User;
import com.dnp.attend.service.UserService;
import com.dnp.attend.util.JsonUtil;
import com.dnp.attend.vo.PageVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("userService")
public class userServiceImpl extends BaseService<User> implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public String findAllRelation(PageVo pageVo, String search) {
		PageHelper.startPage(pageVo.getOffset(), pageVo.getLimit());
		List<Map<String, Object>> list = userMapper.findAllRelation(search);
		PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(list);
		return JsonUtil.pageInJson((int) pageInfo.getTotal(), pageInfo.getList()).toString();
	}

	@Override
	public String findDeatilRelation(Integer id) {
		List<Map<String, Object>> list = userMapper.findById(id);
		if (list.size() == 0) {
			return new JSONObject().toString();
		}
		return new JSONObject(list.get(0)).toString();
	}

	@Override
	public String findByOrgId(PageVo pageVo, String search, Integer orgId) {
		PageHelper.startPage(pageVo.getOffset(), pageVo.getLimit());
		List<Map<String, Object>> list = userMapper.findByOrgId(orgId);
		PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(list);
		return JsonUtil.pageInJson((int) pageInfo.getTotal(), pageInfo.getList()).toString();
	}
}
