package com.ty.first;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Car extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		ServletConfig config=getServletConfig();
		String st=config.getInitParameter("RoadTax") ;
		String st1=config.getInitParameter("SeatBelt") ;
		ServletContext context = getServletContext();
		String s1 = context.getInitParameter("Petrol");
		
		
		
		System.out.println("Petrol: " + s1);
		System.out.println("Road Tax: "+st);
		System.out.println("SeatBelt: "+st1);
		System.out.println("===================");
	}

}
