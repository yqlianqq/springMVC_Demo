package com.sie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sie.model.User;
import com.sie.model.UserCustom;
@Controller
@RequestMapping("/user")
public class UsersController {
	@RequestMapping("/receiveStr")
	public String receiveInt(String username) {
		System.out.println("传递参数的字符串："+username);
		return "hello";
	}
	@RequestMapping("toReceiveArray")
	public String toReceiveArray() {
		return "receiveArray";
	}
	@RequestMapping("toAdd")
	public String toAdd() {
		return "add";
	}
	@RequestMapping("receiveUser")
	public String receiveUser(User user) {
		System.out.println(user);
		System.out.println(user.getAge());
		System.out.println(user.getUsername());
		System.out.println(user.getAddress());
		return "hello";
	}

	@RequestMapping("receiveArray")
	public String receiveIds(Integer[] ids) {
		System.out.println(ids);
		for (Integer integer : ids) {
			System.out.println(integer);
		}
		return "hello";
	}
	@RequestMapping("receiveUserCustomList")
	public String receiveUserCustomList(UserCustom userCustom) {
		System.out.println(userCustom.getUserList());
		for (int i = 0; i < userCustom.getUserList().size(); i++) {
			System.out.println(userCustom.getUserList().get(i).getUsername());
			System.out.println(userCustom.getUserList().get(i).getAge());
		}
		return "hello";
		
	}
}
