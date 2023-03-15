package assignment.day3;

import java.util.Scanner;

public class RegistrationDetails {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=sc.next();
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		System.out.println("Enter your phoneno: ");
		long phoneNo=sc.nextLong();
		System.out.println("Enter your qualification: ");
		String qualification=sc.next();
		System.out.println("Enter your email id[Please provide valid id, after registering your "
				+ "registration id will be mailed]");
		String emailId=sc.next();
		System.out.println("Enter your noofexperience[if any]: ");
		float experience=sc.nextFloat();
		
		
		System.out.println("\n"+"Dear "+name+", Thanks for registering in our portal, registration id will be mailed to "+emailId+" \r\nwithin 2 working days"
				+ "");
		
	}

}
