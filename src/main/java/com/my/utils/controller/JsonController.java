package com.my.utils.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.my.utils.constant.UtilsConstantEnum.JsonTypeEnum;
import com.my.utils.util.JsonFormatTool;

/**
* @Title: JsonController.java  
* @Package com.my.utils.controller  
* @Description: json相关操作
* @author qun.liu
* @date 2016年11月4日 下午5:22:10  
* @version V1.0
 */
@Controller
@RequestMapping(value="/json")
public class JsonController {
	private Logger logger = Logger.getLogger(JsonController.class);
	
	@RequestMapping("/jsonPage")
	public String convertJsonPage(@RequestParam(defaultValue="1", value="type", required=false) String type) {
		logger.info("===========返回"+JsonTypeEnum.getDesc(type)+"页面==============");
		return JsonTypeEnum.getJspUrl(type);
	}
	
	/**
	* @Title: formatJson  
	* @Description: 格式化json
	* @param request
	* @param 设定文件  
	* @return String    返回类型  
	* @throws
	 */
	@ResponseBody
	@RequestMapping(value="/format", produces = "text/html;charset=UTF-8")
	public String formatJson(HttpServletRequest request, @RequestParam(value="jsonStr", required=true) String json) {
		String result = null;
		try {
			if (StringUtils.isNotBlank(json)) {
				result = JsonFormatTool.formatJson(json);
			}
		} catch (Exception e) {
			logger.error("=====json格式化异常====", e);
		}
		logger.info("======格式化后json:".concat(result));
		return JSONObject.toJSONString(result);
	}
	
	
}
