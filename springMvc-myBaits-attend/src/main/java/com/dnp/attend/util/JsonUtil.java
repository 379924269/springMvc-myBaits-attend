package com.dnp.attend.util;

import org.json.JSONObject;

public class JsonUtil {
	/**
	 * <p>
	 * 把分页信息放到json里面
	 * 
	 * @param total
	 *            信息总条数
	 * @param rows
	 *            行信息
	 * @return JSONObject
	 */
	public static JSONObject pageInJson(int total, Object rows) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("total", total);
		jsonObject.put("rows", rows);
		return jsonObject;
	}

	/**
	 * <p>
	 * 错误响应信息
	 * 
	 * @param code
	 *            错误code
	 * @param message
	 *            错误消息
	 * @return 生成的json字符串
	 */
	public static String responseFailJoson(Object code, Object message) {
		return new JSONObject().put("code", code).put("result", false).put("message", message).toString();
	}

	/**
	 * <p>
	 * 成功响应信息
	 * 
	 * @param code
	 *            错误code
	 * @param message
	 *            错误消息
	 * @return 生成的json字符串
	 */
	public static String responseSuccess(Object code, Object message) {
		return new JSONObject().put("code", code).put("result", true).put("message", message).toString();
	}
}
