package assignment.day13.EmployeeAuth;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee();
		System.out.println("Please Enter The Username: ");
		String username = sc.next();
		emp.setUserName(username);
		System.out.println("Please Enter The Password: ");
		String password = sc.next();
		emp.setPassword(password);

		if (emp.login()) {
			System.out.println("Hi, " + username + "! You are Login successfully.");
		} 
		else 
		{
			System.out.println("Hi, " + username + "! your Username or Password incorrect.");
		}
				
	}

}
