package com.my.utils.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.my.utils.constant.UtilsConstantEnum.EncodeTypeEnum;
import com.my.utils.util.EncodeUtils;

/**
 * 解码编码相关
 * @author liuqun
 * @date 2015-11-5 上午10:17:46
 */
@Controller
@RequestMapping("/encode")
public class EncodeController {
	private Logger logger = Logger.getLogger(ConvertController.class);
	
	/**
	 * 编码、解码相关子页面
	 * @param type 转换类型
	 * @return
	 */
	@RequestMapping("/convertPage")
	public String convertCharacterPage(@RequestParam(defaultValue="1", value="type", required=false)String type) {
		logger.info("===========返回"+EncodeTypeEnum.getDesc(type)+"页面==============");
		return EncodeTypeEnum.getJspUrl(type);
	}
	
	/**
	 * 返回base64编码、解码结果
	 * @param map
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/base64", produces = "text/html;charset=UTF-8")
	public String encodeBase64(HttpServletRequest request) {
		logger.info("========开始执行base64转换=========");
		String value = StringUtils.defaultIfBlank(request.getParameter("target"), "");// 需要转化的内容
		String type = StringUtils.defaultIfBlank(request.getParameter("type"), "en");// 转化目标（转为大写还是小写）
		if ("en".equalsIgnoreCase(type)) {
			value = EncodeUtils.getBase64(value);
		} else if ("de".equalsIgnoreCase(type)) {
			value = EncodeUtils.getDeBase64(value);
		}
		logger.info("========执行base64转换结束，转换结果："+value);
		return JSONObject.toJSONString(value);
	}
	
	/**
	 * 返回base64编码、解码结果
	 * @param map
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/url", produces = "text/html;charset=UTF-8")
	public String encodeUrl(HttpServletRequest request) {
		logger.info("========开始执行URL转换=========");
		String value = StringUtils.defaultIfBlank(request.getParameter("target"), "");// 需要转化的内容
		String type = StringUtils.defaultIfBlank(request.getParameter("type"), "en");// 转化目标（转为大写还是小写）
		if ("en".equalsIgnoreCase(type)) {
			value = EncodeUtils.urlEncode(value);
		} else if ("de".equalsIgnoreCase(type)) {
			value = EncodeUtils.urlDecode(value);
		}
		logger.info("========执行URL转换结束，转换结果："+value);
		return JSONObject.toJSONString(value);
	}
	
	/**
	 * escape编码、解码
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/escape", produces = "text/html;charset=UTF-8")
	public String escapeStr(HttpServletRequest request) {
		logger.info("========开始执行escape转换=========");
		String value = StringUtils.defaultIfBlank(request.getParameter("target"), "");// 需要转化的内容
		String type = StringUtils.defaultIfBlank(request.getParameter("type"), "en");// 转化目标（转为大写还是小写）
		if ("en".equalsIgnoreCase(type)) {
			value = EncodeUtils.escape(value);
		} else if ("de".equalsIgnoreCase(type)) {
			value = EncodeUtils.unescape(value);
		}
		logger.info("========执行escape转换结束，转换结果："+value);
		return JSONObject.toJSONString(value);
	}
}
