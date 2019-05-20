package com.work.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
public class IndexController {

	
	 @RequestMapping("/index")
	    public String index(){
	        return "index"; //当浏览器输入/index时，会返回 /templates/home.html页面
	    }
	
}
