package com.my.utils.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.my.utils.constant.UtilsConstantEnum.ConvertTypeEnum;
import com.my.utils.util.ConvertUtils;

/**
 * 其它操作相关controller
 * @author liuqun
 * @date 2015-11-3 下午5:54:45
 */
@Controller
@RequestMapping("/convert")
public class ConvertController {
	
	private Logger logger = Logger.getLogger(ConvertController.class);
	
	/**
	 * 大小写转换page
	 * @param type 转换类型
	 * @return
	 */
	@RequestMapping("/convertPage")
	public String convertCharacterPage(@RequestParam(defaultValue="1", value="type", required=false)String type) {
		logger.info("===========返回"+ConvertTypeEnum.getDesc(type)+"页面==============");
		return ConvertTypeEnum.getJspUrl(type);
	}
	
	/**
	 * 返回大小写转换结果
	 * @param map
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/convertCharacter", produces = "text/html;charset=UTF-8")
	public String convertCharacter(HttpServletRequest request) {
		logger.info("========开始执行大小写转换=========");
		String value = StringUtils.defaultIfBlank(request.getParameter("target"), "");// 需要转化的内容
		String type = StringUtils.defaultIfBlank(request.getParameter("type"), "big");// 转化目标（转为大写还是小写）
		if ("big".equalsIgnoreCase(type)) {
			value = ConvertUtils.printUpperCase(value);
		} else if ("small".equalsIgnoreCase(type)) {
			value = ConvertUtils.printLowerCase(value);
		}
		logger.info("========开始执行大小写转换结束，转换结果："+value);
		return JSONObject.toJSONString(value);
	}
	
	/**
	 * 返回人民币大小写转换结果
	 * @param map
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/convertMoney", produces = "text/html;charset=UTF-8")
	public String convertMoney(HttpServletRequest request) {
		logger.info("========开始执行人民币大小写转换=========");
		String value = StringUtils.defaultIfBlank(request.getParameter("target"), "");// 需要转化的内容
		String type = StringUtils.defaultIfBlank(request.getParameter("type"), "big");// 转化目标（转为大写还是小写）
		if ("big".equalsIgnoreCase(type)) {
			value = ConvertUtils.changeMoneyToUpper(value);
		} else if ("small".equalsIgnoreCase(type)) {
			value = ConvertUtils.printLowerCase(value);
		}
		logger.info("========执行人民币大小写转换结束，转换结果："+value);
		return JSONObject.toJSONString(value);
	}
	
}
