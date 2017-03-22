package com.sie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/user")
public class UsersController {
	@RequestMapping("/receiveInt")
	public String receiveInt(Integer id) {
		System.out.println("id的值："+id);
		return "hello";
		
	}
	@RequestMapping("toAdd")
	public String toAdd() {
		return "add";
		
	}

}
