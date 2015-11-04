package com.my.utils.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.my.utils.constant.UtilsConstantEnum.OtherTypeEnum;
import com.my.utils.util.ProjectUtil;

/**
 * 其它操作相关controller
 * @author liuqun
 * @date 2015-11-3 下午5:54:45
 */
@Controller
@RequestMapping("/other")
public class OtherController {
	
	private Logger logger = Logger.getLogger(OtherController.class);
	
	/**
	 * 大小写转换page
	 * @param type 转换类型
	 * @return
	 */
	@RequestMapping("/convertPage")
	public String convertCharacterPage(@RequestParam(defaultValue="1", value="type", required=false)String type) {
		logger.info("===========返回"+OtherTypeEnum.getDesc(type)+"页面==============");
		return OtherTypeEnum.getJspUrl(type);
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
		String value = StringUtils.defaultIfBlank(request.getParameter("target"), "");// 需要转化的内容
		String type = StringUtils.defaultIfBlank(request.getParameter("type"), "big");// 转化目标（转为大写还是小写）
		if ("big".equalsIgnoreCase(type)) {
			value = ProjectUtil.printUpperCase(value);
		} else if ("small".equalsIgnoreCase(type)) {
			value = ProjectUtil.printLowerCase(value);
		}
		return JSONObject.toJSONString(value);
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
}
