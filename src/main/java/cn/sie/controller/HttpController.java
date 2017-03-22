package cn.sie.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

public class HttpController implements HttpRequestHandler {

	public void handleRequest(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		request.setAttribute("hello", "HttpController");
		request.getRequestDispatcher("/WEB-INF/jsps/index.jsp").forward(request, response);
	}

}
