package com;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class All extends HttpServlet {
	
	
	
	
	

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service http");
	}

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("servlet config");
	}

	public void init() throws ServletException {
		System.out.println("init zero");
	}
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service servlet");
	}

	
	

	public void destroy() {
		System.out.println("Destroy");
	}
	
	

}
