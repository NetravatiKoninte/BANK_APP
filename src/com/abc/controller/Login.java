package com.abc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.abc.model.Model;

public class Login extends HttpServlet {
	protected void service(HttpServletRequest req,HttpServletResponse res ) throws IOException {
		String custid=req.getParameter("custid");
		String password=req.getParameter("pwd");
		Model m=new Model();
		m.setCustid(custid);
		m.setPassword(password);
		boolean temp=m.login();
		if(temp==true)
		{
			HttpSession session=req.getSession(true);
			session.setAttribute("username", m.getUsername());
			session.setAttribute("accno", m.getAccno());
			res.sendRedirect("successLogin.jsp");
		}
		else
		{
			res.sendRedirect("FailureLogin.jsp");
		}
				
	}
	
}
