package com.jsp.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");

		Cookie cookie = new Cookie("cookie_name", name);
		resp.addCookie(cookie);

		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<html><head><body><h1>Welcome " + name + " to my website.</h1></body></head></html>");
		printWriter.write("<a href='servlet2'>Go to Servlet 2</a>");

	}

}
