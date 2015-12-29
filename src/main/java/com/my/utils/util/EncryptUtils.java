package com.my.utils.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

import org.apache.commons.lang.StringUtils;

public class EncryptUtils {
	
	/**
	 * MD5值计算<p>
	 * @param res 源字符串
	 * @return md5值
	 */
	public final static String md5Digest(String res) {
		if(res ==null||"".equals(res)){
			return null;
		}
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		byte[] strTemp;
		try {
			strTemp = res.getBytes("utf-8");
		} catch (UnsupportedEncodingException e1) {
			return null;
		}
		try {
			MessageDigest mdTemp = MessageDigest.getInstance("MD5");
			mdTemp.update(strTemp);
			byte[] md = mdTemp.digest();
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			String dd = new String(str);
			return dd;
		} catch (Exception e) {
			return null;
		}
	}
	
	/**
	 * SHA加密
	 * @param data
	 * @param type
	 * @return
	 */
	public static String shaEncrypt(String data, String type) {
		if (StringUtils.isNotBlank(data)) {
			if ("1".equals(type)) {
				type = "SHA-1";
			} else if ("256".equals(type)) {
				type = "SHA-256";
			} else if ("384".equals(type)) {
				type = "SHA-384";
			} else if ("512".equals(type)) {
				type = "SHA-512";
			} else {
				type = "SHA-1";
			}
			try {
				MessageDigest messageDigestd = MessageDigest.getInstance(type);
				// 执行摘要方法
				byte[] digest = messageDigestd.digest(data.getBytes());
				data = new HexBinaryAdapter().marshal(digest);
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
 		}
		return data;
	}
}
