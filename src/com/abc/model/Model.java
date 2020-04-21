package com.abc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class Model {
String url="jdbc:oracle:thin:@//localhost:1521/XE";
String user="system";
String pw="system";
Connection con;
ResultSet rs;
PreparedStatement pstmt;
private String name;
private String custid;
private int accno;
private String password;
private int balance;
private String emailid;
private String username;

public Model() 
{
	try {
		DriverManager.registerDriver(new OracleDriver());
		con=DriverManager.getConnection(url, user, pw);
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCustid() {
	return custid;
}
public void setCustid(String custid) {
	this.custid = custid;
}

public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


public String getEmailId() {
	return emailid;
}
public void setEmailId(String emailid) {
	this.emailid = emailid;
}

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public boolean register() 
{
	try {
		String query="INSERT INTO BANK_APP VALUES(?,?,?,?,?,?,?)";
		pstmt=con.prepareStatement(query);
		pstmt.setString(1, name);
		pstmt.setString(2, username);
		pstmt.setString(3, custid);
		pstmt.setInt(4, accno);
		pstmt.setString(5, password);
		pstmt.setInt(6, balance);
		pstmt.setString(7, emailid);
		
		int m=pstmt.executeUpdate();
		
		if(m==0)
		{
			return false;
		}
		else
		{
			return true;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

  return false;
	
}

public boolean login()
{
	try {
		pstmt=con.prepareStatement("SELECT * FROM BANK_APP WHERE CUSTID=? AND PASSWORD=?");
		pstmt.setString(1,custid);
		pstmt.setString(2,password);
		rs=pstmt.executeQuery();
		if(rs.next()==true)
		{
			username=rs.getString(2);
			accno=rs.getInt(3);
			return true;
		}
		else
		{
			return false;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	return false;
	
}

}