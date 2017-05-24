package com.dnp.attend.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.dnp.attend.model.User;
import com.dnp.attend.util.MyMapper;

public interface UserMapper extends MyMapper<User> {

	/**
	 * <p>
	 * 获取所有信息
	 * 
	 * @return List<Map<String, Object>>
	 */
	List<Map<String, Object>> findAllRelation(@Param("search") String search);

	List<Map<String, Object>> findById(@Param("id") Integer id);

	List<Map<String, Object>> findByOrgId(@Param("orgId") Integer orgId);
}