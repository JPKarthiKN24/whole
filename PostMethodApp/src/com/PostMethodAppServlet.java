package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class PostMethodAppServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
		String name=req.getParameter("name");
		String address=req.getParameter("address");
		String phone=req.getParameter("phone");
		PrintWriter out=resp.getWriter();
		out.println("Name:"+name);
		out.println("Address:"+address);
		out.println("Phone:"+phone);
		
	}
}
