package com.ty.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String n=req.getParameter("name");
		String n1=req.getParameter("mail");
		
		PrintWriter printWriter=res.getWriter();
		
		printWriter.write("<html><body>");
		printWriter.write("<h1>"+n+"</h1>");
		printWriter.write("<h1>"+n1+"</h1>");
		printWriter.write("</body></html>");
	}
}
