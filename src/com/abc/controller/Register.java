
package com.abc.controller;

import java.io.IOException;
//import java.security.Provider.Service;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.model.Model;


public class Register extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		String custid=req.getParameter("custid");
		//String accno=req.getParameter("accno");
		Integer accno=new Integer(req.getParameter("accno"));
		String password=req.getParameter("password");
		//String balance=req.getParameter("balance");
		Integer balance=new Integer(req.getParameter("balance"));
		String emailid=req.getParameter("emailid");
		String username=req.getParameter("username");
		
			Model m=new Model();
			m.setName(name);
			m.setCustid(custid);
			m.setBalance(balance);
			m.setPassword(password);
			m.setAccno(accno);
			m.setEmailId(emailid);
			m.setUsername(username);
			boolean temp=m.register();
			if(temp==true)
			{
				res.sendRedirect("success.jsp");
			}
			else {
				res.sendRedirect("failure.jsp");
			}
		 
		}
		
	}
	
	
