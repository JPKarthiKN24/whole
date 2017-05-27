package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostAppMethodServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		
		String name=req.getParameter("name");
		String address=req.getParameter("password");
		
		PrintWriter out=resp.getWriter();
		out.println("Name:"+name);
		out.println("Password:"+address);
		
		resp.sendRedirect("index.html");
	}
}
