package com.sie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/user")
public class UsersController {
	@RequestMapping("/receiveStr")
	public String receiveInt(String username) {
		System.out.println("传递参数的字符串："+username);
		return "hello";
		
	}
	@RequestMapping("toAdd")
	public String toAdd() {
		return "add";
		
	}

}
