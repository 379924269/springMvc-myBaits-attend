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
}
