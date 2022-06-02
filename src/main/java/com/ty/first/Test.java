package com.ty.first;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet {
	
	static {
		System.out.println("load  class");
	}
	{
		System.out.println("Instance A the class");
	}
	@Override
	public void init() throws ServletException {

	System.out.println("initilaze in it");
	}

     @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {

    	 int c=0;
    	 System.out.println("Service "+c++);
     }
     @Override
    public void destroy() {
    	 System.out.println("destroy");
    }
}
