package com.klef;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletInterfaceDemo1 implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Date d = new Date();
		
		arg1.setContentType("text/html");
		PrintWriter pw= arg1.getWriter();
		pw.print("<html>");
		pw.print("<head><title> Servlet Interface</title></head>");
		pw.print("<body>");
		pw.print("<h2>SID-DATE:" +d.toString() + "</h2");
		pw.print("</body");
		pw.print("</html");
		
		
	}

}
