package com.dnp.attend.shiro.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.web.filter.PathMatchingFilter;

/**
 * Description:
 * PathMatchingFilter提供了基于Ant风格的请求路径匹配功能及拦截器参数解析的功能，如“roles[admin,user
 * ]”自动根据“，”分割解析到一个路径参数配置并绑定到相应的路径： pathsMatch：该方法用于path与请求路径进行匹配的方法；如果匹配返回true；
 * onPreHandle：在preHandle中
 * ，当pathsMatch匹配一个路径后，会调用opPreHandler方法并将路径绑定参数配置传给mappedValue
 * ；然后可以在这个方法中进行一些验证（如角色授权），如果验证失败可以返回false中断流程；默认返回true；也就是说子类可以只实现
 * onPreHandle即可，无须实现preHandle。如果没有path与请求路径匹配，默认是通过的（即preHandle返回true）。
 * 
 * 如果我们想进行访问访问的控制就可以继承AccessControlFilter；
 * 如果我们要添加一些通用数据我们可以直接继承PathMatchingFilter。
 * 
 * @author xhxing
 * @since JDK 1.6
 */
public class SysUserFilter extends PathMatchingFilter {

//	@Inject
//	private UserMapper userMapper;

	@Override
	protected boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
		System.out.println("如果我们要添加一些通用数据我们可以直接继承PathMatchingFilter");
//
//		String username = (String) SecurityUtils.getSubject().getPrincipal();
//		UserFormMap userFormMap = new UserFormMap();
//		userFormMap.put("accountName", "" + username + "");
//		request.setAttribute("user", userMapper.findByNames(userFormMap));
		return true;
	}
}