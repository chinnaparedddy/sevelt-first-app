package com.ty.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class PersonDetails extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String n = req.getParameter("myName");
		String n1 = req.getParameter("myPhone");
		String n2 = req.getParameter("myEmail");
		String n3 = req.getParameter("myPassword");
		PrintWriter printWriter = res.getWriter();
		String htmlcode = "<html><body><h1> " + n + "</h></body></html>";
		printWriter.write(htmlcode);

		String htmlcode1 = "<html><body><h1> " + n1 + "</h></body></html>";
		printWriter.write(htmlcode1);

		String htmlcode2 = "<html><body><h1> " + n2 + "</h></body></html>";
		printWriter.write(htmlcode2);

		String htmlcode3 = "<html><body><h1> " + n3 + "</h></body></html>";
		printWriter.write(htmlcode3);

	}

}
