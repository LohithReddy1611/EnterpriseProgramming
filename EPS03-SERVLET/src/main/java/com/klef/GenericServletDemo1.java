package com.klef;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServletDemo1 extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
        Date d = new Date();
		
		arg1.setContentType("text/html");
		PrintWriter pw= arg1.getWriter();
		pw.print("<html>");
		pw.print("<head><title> Generic Interface</title></head>");
		pw.print("<body>");
		pw.print("<h2>GSD-DATE:" +d.toString() + "</h2");
		pw.print("</body");
		pw.print("</html");
		
	}

}
