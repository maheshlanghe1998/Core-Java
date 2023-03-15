package com.string.assignment;

import java.util.Scanner;

public class Login {

	private String userName , password;
	
	
	
	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Login(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	
	public boolean validate(String username, String pass)
	{
		if(username.equals("john") && pass.equals("123abc"))
		{
			return true;
			
		}
		return false;
		
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the username: ");
		String uname = sc.next();
		System.out.println("Enter the password: ");
		String pass = sc.next();
		
		Login obj = new Login(uname,pass);
		
		if(obj.validate(uname, pass))
		{
			System.out.println("Valid user");
		}
		else
		{
			System.out.println("Invalid User");
		}
		

	}

}
