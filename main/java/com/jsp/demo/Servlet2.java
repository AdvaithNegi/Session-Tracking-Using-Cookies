package com.jsp.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String temp_name = null;

		Cookie cookie[] = req.getCookies();
		for (Cookie cookie2 : cookie) {
			if (cookie2.getName().equals("cookie_name"))
				temp_name = cookie2.getValue();
		}

		PrintWriter printWriter = resp.getWriter();
		printWriter
				.write("<html><head><body><h1>Welcome back " + temp_name + " to my website.</h1></body></head></html>");

	}

}
