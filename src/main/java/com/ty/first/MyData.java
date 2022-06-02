package com.ty.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyData extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String n=req.getParameter("myperson");
		String htmlcode="<html><body><h1>Welcome "+n+"Data</h1></body></html>";
		
		PrintWriter printWriter=res.getWriter();
		printWriter.write(htmlcode);
	}

}
