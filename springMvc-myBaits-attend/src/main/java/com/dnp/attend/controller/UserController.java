package com.dnp.attend.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dnp.attend.model.User;
import com.dnp.attend.vo.PageVo;

/**
 * @author liuzh_3nofxnp
 * @since 2015-09-19 17:15
 */
@Api(value = "userController", description = "用户信息")
@RestController
public class UserController {

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	@ApiOperation(value = "查找所有country", notes = "查找所有country", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public Object getList(PageVo pageVo,
			@ApiParam(name = "search", value = "模糊查询字段（名称或email）", required = false) @RequestParam(required = false, defaultValue = "") String search) {
		return "";
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "country的detail", notes = "country的detail", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Object getDetail(@ApiParam(name = "id", value = "用户id", required = true) @PathVariable("id") Integer id) {
		return "";
	}

	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	@ApiOperation(value = "添加或修改(有id就修改)user", notes = "添加或修改(有id就修改)user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void add(User country) {
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "删除用户", notes = "删除用户", httpMethod = "DELETE", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void delete(@ApiParam(name = "id", value = "用户id", required = true) @PathVariable("id") Integer id) {
	}
}
