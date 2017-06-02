package com.dnp.attend.util;

import java.util.HashMap;
import java.util.Map;

public class MapUtil {
	/**
	 * <p>
	 * 成功响应信息
	 * 
	 * @param code
	 *            错误code
	 * @param message
	 *            错误消息
	 * @return 生成的Map<String, Object>
	 */
	public static Map<String, Object> responseExceptionMap(Object code, Object message) {
		Map<String, Object> map = new HashMap<>();
		map.put("code", code);
		map.put("result", false);
		map.put("message", message);
		return map;
	}
}
