package com.my.utils.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

/**
 * 加密解密相关
 * @author liuqun
 * @date 2015-11-5 上午10:15:51
 */
public class EncryptionController {

	/**
	 * js加密、解密
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/jsoperate", produces = "text/html;charset=UTF-8")
	public String jsoperate(HttpServletRequest request) {
		String value = StringUtils.defaultIfBlank(request.getParameter("target"), "");// 源js内容
		String type = StringUtils.defaultIfBlank(request.getParameter("type"), "encryption");// 加密/解密
		if ("encryption".equalsIgnoreCase(type)) {// 加密
			value = value.toUpperCase();
		} else if ("decrypt".equalsIgnoreCase(type)) {// 解密
			value = value.toLowerCase();
		}
		return JSONObject.toJSONString(value);
	}
	
}
