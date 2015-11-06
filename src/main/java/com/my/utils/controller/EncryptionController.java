package com.my.utils.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.my.utils.constant.UtilsConstantEnum.EncryptTypeEnum;
import com.my.utils.util.EncryptUtils;

/**
 * 加密解密相关
 * @author liuqun
 * @date 2015-11-5 上午10:15:51
 */
@Controller
@RequestMapping("/encrypt")
public class EncryptionController {

	private Logger logger = Logger.getLogger(ConvertController.class);
	
	/**
	 * 加密、解密page
	 * @param type 类型
	 * @return
	 */
	@RequestMapping("/convertPage")
	public String convertCharacterPage(@RequestParam(defaultValue="1", value="type", required=false)String type) {
		logger.info("===========返回"+EncryptTypeEnum.getDesc(type)+"页面==============");
		return EncryptTypeEnum.getJspUrl(type);
	}
	
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
	
	/**
	 * md5加密
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/md5Encryption", produces = "text/html;charset=UTF-8")
	public String md5Encryption(HttpServletRequest request) {
		String value = StringUtils.defaultIfBlank(request.getParameter("target"), "");// 源加密内容
		if (StringUtils.isNotBlank(value)) {
			value = EncryptUtils.md5Digest(value);
		}
		return JSONObject.toJSONString(value);
	}
	
	/**
	 * DES加密,解密
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/DESEncryption", produces = "text/html;charset=UTF-8")
	public String desEncryption(HttpServletRequest request) {
		String value = StringUtils.defaultIfBlank(request.getParameter("target"), "");// 源js内容
		String type = StringUtils.defaultIfBlank(request.getParameter("type"), "encryption");// 加密/解密
		if ("encryption".equalsIgnoreCase(type)) {// 加密
		} else if ("decrypt".equalsIgnoreCase(type)) {// 解密
		}
		return JSONObject.toJSONString(value);
	}
}
