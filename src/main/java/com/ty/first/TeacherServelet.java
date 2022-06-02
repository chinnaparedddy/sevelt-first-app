 package com.ty.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TeacherServelet  extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name=req.getParameter("name");
		String email=req.getParameter("mail");
		
		PrintWriter printWriter=resp.getWriter() ;
		
		printWriter.write("<html><body>");
		printWriter.write("<h1>"+name+"</h1>");
		printWriter.write("<h1>"+email+"</h1>");
		printWriter.write("</body></html>");
		System.out.println("StartUp");
	}
}
