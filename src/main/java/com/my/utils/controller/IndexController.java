package com.my.utils.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页controller
 * @author liuqun
 */
@Controller
public class IndexController {

	@RequestMapping("/index")
	public String indexPage(ModelMap map){
		return "index/u_home";
	}
}
