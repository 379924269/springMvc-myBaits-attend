package com.dnp.attend.service.impl;

import java.util.List;
import java.util.Map;

import org.json.JSONObject;

import tk.mybatis.mapper.entity.Example;

import com.dnp.attend.model.User;
import com.dnp.attend.util.JsonUtil;
import com.dnp.attend.vo.PageVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;

public class CommonMethod {

	public static String findAllRelation(PageVo pageVo, String searchField, String search, List<Map<String, Object>> list) {
		PageHelper.startPage(pageVo.getOffset(), pageVo.getLimit());
		Example example = new Example(User.class);
		Example.Criteria criteria = example.createCriteria();
		if (StringUtil.isNotEmpty(search)) {
			criteria.andLike(searchField, "%" + search + "%");
		}
		PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(list);
		return JsonUtil.pageInJson((int) pageInfo.getTotal(), pageInfo.getList()).toString();
	}

	public static String findDeatilRelation(List<Map<String, Object>> list, String whereField, int id) {
		Example example = new Example(User.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andEqualTo(whereField, id);
		if (list.size() == 0) {
			return new JSONObject().toString();
		}
		return list.get(0).toString();
	}
}
