package com;

import java.io.IOException;
import javax.servlet.http.*;
import java.io.*;  
import javax.servlet.*;  

@SuppressWarnings("serial")
public class FirstServletAppServlet extends HttpServlet { 
	ServletConfig config=null;  
	  
	public void init(ServletConfig config){  
	this.config=config;  
	System.out.println("servlet is initialized");  
	}  
	  
	public void doGet(HttpServletRequest req,HttpServletResponse res)  
	throws IOException,ServletException{  
	  
	res.setContentType("text/plain");  
	  
	PrintWriter out=res.getWriter();  
	out.print("<html><body>");  
	out.print("<b>hello simple servlet</b>");  
	out.print("</body></html>");  
	  
	}  
	public void destroy(){System.out.println("servlet is destroyed");}  
	public ServletConfig getServletConfig(){return config;}  
	public String getServletInfo(){return "copyright 2007-1010";}  
	  
	}  
