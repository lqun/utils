package com.my.utils.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.apache.commons.lang.StringUtils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class EncodeUtils {
	// Base64编码
	public static String getBase64(String str) {
		byte[] byteArr = null;// 字符串转化为的字节数组
		try {
			byteArr = str.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		// 执行编码
		if (byteArr != null && byteArr.length > 0) {
			str = new BASE64Encoder().encode(byteArr);
		}
		return str;
	}

	// Base64解码
	public static String getDeBase64(String str) {
		byte[] byteArr = null;// 字符串转化为的字节数组
		String result = null;
		// 执行解码
		if (StringUtils.isNotBlank(str)) {
			BASE64Decoder decoder = new BASE64Decoder();
			try {
				byteArr = decoder.decodeBuffer(str);
				result = new String(byteArr, "utf-8");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	/**
	 * url编码
	 * @param url
	 * @return
	 */
	public static String urlEncode(String url) {
		String urlStr = null;  // 编码结果
		if (StringUtils.isNotBlank(url)) {
			try {
				urlStr = URLEncoder.encode(url, "utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		return urlStr;
	}
	/**
	 * url解码
	 * @param url
	 * @return
	 */
	public static String urlDecode(String url) {
		String urlStr = null;  // 解码结果
		if (StringUtils.isNotBlank(url)) {
			try {
				urlStr = URLDecoder.decode(url, "utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		return urlStr;
	}
	
	/**
	 * escape 编码
	 * @param str
	 * @return
	 */
	public static String escape(String str) {
		StringBuffer stringBuffer = null;
		if (StringUtils.isNotBlank(str)) {
			stringBuffer = new StringBuffer(str.length() * 6);
			for (int i = 0; i < str.length(); i++) {
				char j = str.charAt(i);
				if (Character.isDigit(j) || Character.isLowerCase(j) || Character.isUpperCase(j)) {
					stringBuffer.append(j);
				} else if (j < 256) {
					stringBuffer.append("%");
					if (j < 16) {
						stringBuffer.append("0");
					}
					stringBuffer.append(Integer.toString(j, 16));
				} else {
					stringBuffer.append("%u");
					stringBuffer.append(Integer.toString(j, 16));
				}
			}
		}
		return stringBuffer.toString();
	}

	/**
	 * escape 解码
	 * @param str
	 * @return
	 */
	public static String unescape(String str) {
		StringBuffer stringBuffer = new StringBuffer(str.length());
		int lastPos = 0, pos = 0;
		char ch;
		while (lastPos < str.length()) {
			pos = str.indexOf("%", lastPos);
			if (pos == lastPos) {
				if (str.charAt(pos + 1) == 'u') {
					ch = (char) Integer.parseInt(str.substring(pos + 2, pos + 6), 16);
					stringBuffer.append(ch);
					lastPos = pos + 6;
				} else {
					ch = (char) Integer.parseInt(str.substring(pos + 1, pos + 3), 16);
					stringBuffer.append(ch);
					lastPos = pos + 3;
				}
			} else {
				if (pos == -1) {
					stringBuffer.append(str.substring(lastPos));
					lastPos = str.length();
				} else {
					stringBuffer.append(str.substring(lastPos, pos));
					lastPos = pos;
				}
			}
		}
		return stringBuffer.toString();
	}
	
}
