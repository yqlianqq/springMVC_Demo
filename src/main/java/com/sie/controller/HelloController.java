package com.sie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController {
		//RequestMapping��һ���������������ַӳ���ע�⣬��������򷽷��ϡ�
		//�������ϣ���ʾ���е�������Ӧ����ķ��������Ըõ�ַ��Ϊ��·����
		@RequestMapping("/helloC")
		public String myHello() {
			return "hello";
		}
}
