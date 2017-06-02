package com.dnp.attend.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtil {

	public static Logger getLog(Object classObject) {
		return LoggerFactory.getLogger(Object.class);
	}
}
