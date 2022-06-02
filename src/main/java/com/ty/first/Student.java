package com.ty.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Student extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String n1 = req.getParameter("name");
		String n2 = req.getParameter("mail");
		String n3 = req.getParameter("phone");
		String n4 = req.getParameter("gender");
		String n5 = req.getParameter("password");
		String n6 = req.getParameter("country");
		PrintWriter printWriter = res.getWriter();
		// String n7=req.getParameter("name");
		String code = "<html><body><h1>" + n1 + "</h1></body></html>";
		printWriter.write(code);
		
		String code1 = "<html><body><h1>" + n2 + "</h1></body></html>";
		printWriter.write(code1);
		
		String code2 = "<html><body><h1>" + n3 + "</h1></body></html>";
		printWriter.write(code2);
		
		String code3 = "<html><body><h1>" + n4 + "</h1></body></html>";
		printWriter.write(code3);
		
		String code4 = "<html><body><h1>" + n5 + "</h1></body></html>";
		printWriter.write(code4);
		
		String code5 = "<html><body><h1>" + n6 + "</h1></body></html>";
		printWriter.write(code5);

	}

}
