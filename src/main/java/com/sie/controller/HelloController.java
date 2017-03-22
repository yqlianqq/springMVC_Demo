package com.sie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController {
		//RequestMapping是一个用来处理请求地址映射的注解，可用于类或方法上。
		//用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径。
		@RequestMapping("/helloC")
		public String myHello() {
			return "hello";
		}
}
