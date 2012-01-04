package com.nelson.sort.util;

import org.slf4j.LoggerFactory;

public class LogUtil {

	public static void info(String msg){
		LoggerFactory.getLogger(LogUtil.class).info(msg);
	}
}
