package com.my.utils.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

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
	 * 字母大小写转换page
	 * @return
	 */
	@RequestMapping("/convertPage")
	public String convertCharacterPage(ModelMap map) {
		return "other/u_convertCharacter";
	}
}
