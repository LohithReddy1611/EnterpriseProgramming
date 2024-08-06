package com.klef;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServletDemo1 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
Date d = new Date();
		
		res.setContentType("text/html");
		PrintWriter pw= res.getWriter();
		pw.print("<html>");
		pw.print("<head><title> HttpServlet Interface</title></head>");
		pw.print("<body>");
		pw.print("<h2>HSD-DATE:" +d.toString() + "</h2");
		pw.print("</body");
		pw.print("</html");
}
}
