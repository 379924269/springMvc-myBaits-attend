package com.dnp.attend.service.impl;

import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tk.mybatis.mapper.entity.Example;

import com.dnp.attend.mapper.UserMapper;
import com.dnp.attend.model.User;
import com.dnp.attend.service.UserService;
import com.dnp.attend.util.JsonUtil;
import com.dnp.attend.vo.PageVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;

@Service("userService")
public class userServiceImpl extends BaseService<User> implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public String findAllRelation(PageVo pageVo, String search) {
		PageHelper.startPage(pageVo.getOffset(), pageVo.getLimit());
		Example example = new Example(User.class);
		Example.Criteria criteria = example.createCriteria();
		if (StringUtil.isNotEmpty(search)) {
			criteria.andLike("u.name", "%" + search + "%");
		}

		List<Map<String, Object>> list = userMapper.findAllRelation();
		PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(list);
		return JsonUtil.pageInJson((int) pageInfo.getTotal(), pageInfo.getList()).toString();
	}

	@Override
	public String findDeatilRelation(Integer id) {
		Example example = new Example(User.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andEqualTo("name", id);
		List<Map<String, Object>> list = userMapper.findAllRelation();
		if (list.size() == 0) {
			return new JSONObject().toString();
		}
		return new JSONObject(list.get(0)).toString();
	}
}
