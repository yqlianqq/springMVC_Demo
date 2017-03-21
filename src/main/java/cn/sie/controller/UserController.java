package cn.sie.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class UserController implements Controller{

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView ModelAndView = new ModelAndView();
		ModelAndView.addObject("hello","hello springMVC");
		ModelAndView.setViewName("/WEB-INF/jsps/index.jsp");
		return ModelAndView;
	}

}
