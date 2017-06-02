package com.dnp.attend.controller;

import javax.servlet.http.HttpServletRequest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dnp.attend.model.User;
import com.dnp.attend.service.UserService;
import com.dnp.attend.util.JsonUtil;
import com.dnp.attend.util.LoggerUtil;
import com.dnp.attend.vo.PageVo;

/**
 * @author liuzh_3nofxnp
 * @since 2015-09-19 17:15
 */
@Api(value = "userController", description = "用户信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	@ApiOperation(value = "查找所有country", notes = "查找所有country", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public Object getList(PageVo pageVo,
			@ApiParam(name = "search", value = "模糊查询字段（名称或email）", required = false) @RequestParam(required = false, defaultValue = "") String search) {
		return userService.findAllRelation(pageVo, search);
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "用户个人信息接口", notes = "用户个人信息接口", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Object getDetail(@ApiParam(name = "id", value = "用户id", required = true) @PathVariable("id") Integer id) {
		return userService.findDeatilRelation(id);
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ApiOperation(value = "添加user", notes = "添加user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void add(User user) {
		userService.save(user);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	@ApiOperation(value = "修改user", notes = "修改user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void update(User user) {
		userService.updateNotNull(user);
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "删除用户", notes = "删除用户", httpMethod = "DELETE", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void delete(@ApiParam(name = "id", value = "用户id", required = true) @PathVariable("id") Integer id) {
		userService.delete(id);
	}

	@RequestMapping(value = "/user/org/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "指定部门所用户信息", notes = "指定部门所用户信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	@RequiresPermissions("device.APK.add")
	public Object getUsersInOrg(PageVo pageVo, @ApiParam(name = "id", value = "用户id", required = true) @PathVariable("id") Integer id,
			@ApiParam(name = "search", value = "模糊查询字段（名称或email）", required = false) @RequestParam(required = false, defaultValue = "") String search) {
		return userService.findByOrgId(pageVo, search, id);
	}

	@ApiOperation(value = "用户登录", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@RequestMapping(value = "/user/login", method = RequestMethod.POST)
	public String login(
			@ApiParam(name = "userName", value = "用户名称", required = true, defaultValue = "guanliyuan") @RequestParam String userName,
			@ApiParam(name = "password", value = "用户密码", required = false, defaultValue = "e10adc3949ba59abbe56e057f20f883e") @RequestParam String password,
			HttpServletRequest request) {
		try {
			if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)) {
				return JsonUtil.responseFailJoson("", "用户名或密码不能为空！");
			}
			// 想要得到 SecurityUtils.getSubject()　的对象．．访问地址必须跟ｓｈｉｒｏ的拦截地址内．不然后会报空指针
			Subject user = SecurityUtils.getSubject();
			// 用户输入的账号和密码,,存到UsernamePasswordToken对象中..然后由shiro内部认证对比,
			// 认证执行者交由ShiroDbRealm中doGetAuthenticationInfo处理
			// 当以上认证成功后会向下执行,认证失败会抛出异常
			UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
			try {
				user.login(token);
			} catch (LockedAccountException lae) {
				token.clear();
				LoggerUtil.getLog(UserController.class).error("error : 用户已经被锁定不能登录,请与管理员联系！");
				return JsonUtil.responseFailJoson(200, "用户已经被锁定不能登录,请与管理员联系！");
			} catch (ExcessiveAttemptsException e) {
				token.clear();
				LoggerUtil.getLog(UserController.class).error("error : 账号：{} 登录失败次数过多,锁定10分钟!", userName);
				return JsonUtil.responseFailJoson(200, "登录失败次数过多,锁定10分钟!");
			} catch (AuthenticationException e) {
				token.clear();
				LoggerUtil.getLog(UserController.class).error("error : 用户或密码不正确！");
				return JsonUtil.responseFailJoson(200, "用户或密码不正确！");
			}
			request.removeAttribute("error");
		} catch (Exception e) {
			e.printStackTrace();
			return "/user/login";
		}
		return JsonUtil.responseSuccess(200, "登陆成功");
	}
	
	@ApiOperation(value = "用户登录", hidden = true)
	@RequestMapping(value = "/user/login", method = RequestMethod.GET)
	public String login() {
		return JsonUtil.responseSuccess(200, "请登录");
	}
	
	@ApiOperation(value = "chengong", hidden = true)
	@RequestMapping(value = "/user/loginSuccess")
	public String loginSuccess() {
		return JsonUtil.responseSuccess(200, "登陆成功......");
	}
	
	@ApiOperation(value = "unauthorizedUrl", hidden = true)
	@RequestMapping(value = "/user/unauthorizedUrl")
	public String unauthorizedUrl() {
		return JsonUtil.responseSuccess(200, "无权限");
	}
	
	@ApiOperation(value = "kickoutUrl", hidden = true)
	@RequestMapping(value = "/user/kickoutUrl")
	public String kickoutUrl() {
		return JsonUtil.responseSuccess(200, "kickoutUrl");
	}

}
