package com.lovo.util;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 通用工具类
 * @author 骆昊
 *
 */
public final class CommonUtil {
	private static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd";

	private static SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATE_PATTERN);

	private CommonUtil() {
		throw new AssertionError();
	}

	/**
	 * 将字符串的首字母大写
	 */
	public static String capitalize(String str) {
		StringBuilder sb = new StringBuilder();
		if (str != null && str.length() > 0) {
			sb.append(str.substring(0, 1).toUpperCase());
			if (str.length() > 1) {
				sb.append(str.substring(1));
			}
			return sb.toString();
		}
		return str;
	}
	
	/**
	 * 生成随机颜色
	 */
	public static Color getRandomColor() {
		int r = (int) (Math.random() * 256);
		int g = (int) (Math.random() * 256);
		int b = (int) (Math.random() * 256);
		return new Color(r, g, b);
	}
	
	/**
	 * 设置工具类使用的时间日期格式化样式
	 */
	public static void setDateFormatPattern(String pattern) {
		formatter = new SimpleDateFormat(pattern);
	}
	
	/**
	 * 将字符串值按指定的类型转换成转换成对象
	 * @param elemType 类型
	 * @param value 字符串值
	 */
	public static Object changeStringToObject(Class<?> elemType, String value) {
		Object tempObj = value;
		if(elemType == int.class || elemType == Integer.class) {
			tempObj = Integer.parseInt(value);
		}
		else if(elemType == long.class || elemType == Long.class) {
			tempObj = Long.parseLong(value);
		}
		else if(elemType == double.class || elemType == Double.class) {
			tempObj = Double.parseDouble(value);
		}
		else if(elemType == float.class || elemType == Float.class) {
			tempObj = Float.parseFloat(value);
		}
		else if(elemType == boolean.class || elemType == Boolean.class) {
			tempObj = Boolean.parseBoolean(value);
		}
		else if(elemType == java.util.Date.class) {
			tempObj = parseStringToDate(value);
		}
		
		return tempObj;
	}

	public static String getFileSuffix(String filename) {
		int index = filename.lastIndexOf(".");
		return index > 0 ? filename.substring(index) : "";
	}
	
	public static String formatDateToString(Date date) {
		return formatter.format(date);
	}
	
	public static Date parseStringToDate(String str) {
		try {
			return formatter.parse(str);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}
}
