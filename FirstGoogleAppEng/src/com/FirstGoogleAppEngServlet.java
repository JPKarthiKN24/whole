package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class FirstGoogleAppEngServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
		
		String name=req.getParameter("firstname");

		PrintWriter out=resp.getWriter();
		
		out.print("welcome "+name);
	}
}
	