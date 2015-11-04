package com.my.utils.util;

/**
 * 工程工具类
 * @author liuqun
 *
 */
public class ProjectUtil {

	/**
	 * 转换为大写
	 * @param str
	 * @return
	 */
	public static String printUpperCase(String str) {
		char charArry[] = str.toCharArray();
		for (int i = 0; i < charArry.length; i++) {
			if (((int)charArry[i] > 96) && ((int)charArry[i] < 123)) {
				charArry[i] = (char) ((int)charArry[i] - 32);
			}
		}
		return String.valueOf(charArry);
	}
	
	/**
	 * 转换为小写
	 * @param str
	 * @return
	 */
	public static String printLowerCase(String str) {
		char charArry[] = str.toCharArray();
		for (int i = 0; i < charArry.length; i++) {
			if (((int)charArry[i] > 64) && ((int)charArry[i] < 91)) {
				charArry[i] = (char) ((int)charArry[i] + 32);
			}
		}
		return String.valueOf(charArry);
	}
}
