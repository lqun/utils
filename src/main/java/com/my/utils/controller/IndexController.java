package com.my.utils.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页controller
 * @author liuqun
 */
@Controller
public class IndexController {

	private Logger logger = Logger.getLogger(IndexController.class);
	
	@RequestMapping("/index")
	public String indexPage(ModelMap map){
		logger.info("返回首页");
		return "index/u_home";
	}
}
