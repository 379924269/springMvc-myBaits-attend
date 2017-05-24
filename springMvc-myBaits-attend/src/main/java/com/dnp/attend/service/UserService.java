package com.dnp.attend.service;

import com.dnp.attend.model.User;
import com.dnp.attend.vo.PageVo;

public interface UserService extends IService<User> {
	/**
	 * <p>
	 * 获取指定部门所有用户信息
	 * 
	 * @param pageVo
	 * @param search
	 * @param orgId
	 * @return
	 */
	String findByOrgId(PageVo pageVo, String search, Integer orgId);
}
