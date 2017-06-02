package com.dnp.attend.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.dnp.attend.util.LoggerUtil;
import com.dnp.attend.util.MapUtil;

/**
 * Description: 统一处理异常 CreatedDate: 2017年3月6日 下午3:49:09
 * 
 * @author xhxing
 * @since JDK 1.6
 */
public class MyHandlerExceptionResolver implements HandlerExceptionResolver {

	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

		// 这样写时为了返回json对象而不返回页面
		MappingJackson2JsonView mappingJackson2JsonView = new MappingJackson2JsonView();
		ModelAndView modelAndView = new ModelAndView(mappingJackson2JsonView);
		// 获取controller的命名空间,正对不同controller进行不同的异常处理
		String nameSpace = request.getServletPath();


		if (!handleUserException(ex, modelAndView, nameSpace).getModelMap().isEmpty()) {
			return handleUserException(ex, modelAndView, nameSpace);
		}

		if (!handleCommonException(ex, modelAndView, nameSpace).getModelMap().isEmpty()) {
			return handleCommonException(ex, modelAndView, nameSpace);
		}

		modelAndView.addAllObjects(MapUtil.responseExceptionMap(200, "服务器调皮了，请联系管理员"));
		LoggerUtil.getLog(MyHandlerExceptionResolver.class).error("=====服务器调皮了!=======");
		ex.printStackTrace();
		return modelAndView;
	}

	/**
	 * <p>
	 * 处理公共异常
	 * 
	 * @param ex
	 * @param modelAndView
	 * @param nameSpace
	 * @return
	 */
	private ModelAndView handleCommonException(Exception ex, ModelAndView modelAndView, String nameSpace) {
		if (ex.getLocalizedMessage().toLowerCase().contains("duplicate")) {
			modelAndView.addAllObjects(MapUtil.responseExceptionMap(200, getDuplicateKey(nameSpace, ex) + "重复"));
			return modelAndView;
		}

		if (ex instanceof AuthorizationException) {
			return modelAndView.addAllObjects(MapUtil.responseExceptionMap(401, "接口未授权,请联系管理员"));
		}

		if (ex.getLocalizedMessage().endsWith("Incorrect result size: expected 1, actual 0")) {
			modelAndView.addAllObjects(MapUtil.responseExceptionMap(200, getModelName(nameSpace) + "无相关信息,请传入正确id"));
			return modelAndView;
		}
		return modelAndView;
	}

	/**
	 * <p>
	 * 处理用户异常信息
	 * 
	 * @param ex
	 * @param modelAndView
	 * @param nameSpace
	 * @return
	 */
	private ModelAndView handleUserException(Exception ex, ModelAndView modelAndView, String nameSpace) {
		if (nameSpace.contains("user")) {
			if (ex.getLocalizedMessage().toLowerCase().contains("foreign key") && ex.getLocalizedMessage().toLowerCase().contains("role_id")) {
				modelAndView.addAllObjects(MapUtil.responseExceptionMap(200, "角色id不存在"));
				return modelAndView;
			}
		}
		return modelAndView;
	}

	/**
	 * <p>
	 * 通过命名空间获取中文名称
	 * 
	 * @param nameSpace
	 *            命名空间
	 * @return string 模块名称
	 */
	private static String getModelName(String nameSpace) {
		if (nameSpace.contains("application")) {
			return "应用";
		}

		if (nameSpace.contains("config")) {
			return "配置";
		}

		if (nameSpace.contains("device")) {
			return "设备";
		}

		if (nameSpace.contains("local")) {
			return "归属地";
		}

		if (nameSpace.contains("model")) {
			return "型号";
		}

		if (nameSpace.contains("resource")) {
			return "资源";
		}

		if (nameSpace.contains("role")) {
			return "角色";
		}

		if (nameSpace.contains("tfcard")) {
			return "tf卡";
		}

		if (nameSpace.contains("user")) {
			return "用户";
		}
		return "";

	}

	/**
	 * <p>
	 * 获取重复的键值
	 * 
	 * @param nameSpace
	 *            命名空间
	 * @return string 模块名称
	 */
	private static String getDuplicateKey(String nameSpace, Exception ex) {
		if (nameSpace.contains("application")) {
			return "应用";
		}

		if (nameSpace.contains("config")) {
			return "配置";
		}

		if (nameSpace.contains("device")) {
			return "设备序列号";
		}

		if (nameSpace.contains("local")) {
			return "归属地名称";
		}

		if (nameSpace.contains("model")) {
			return "型号名称";
		}

		if (nameSpace.contains("resource")) {
			return "资源";
		}

		if (nameSpace.contains("role")) {
			return "角色名称";
		}

		if (nameSpace.contains("tfcard")) {
			return "tf卡号";
		}

		if (nameSpace.contains("user")) {
			return "用户email";
		}
		return "";

	}
}
