package assignment.day3;

import java.util.Scanner;

public class CustomerDetails {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=sc.next();
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		System.out.println("Enter Gender: ");
		String gender=sc.next();
		System.out.println("Hailing from: ");
		String city=sc.next();
		
		System.out.println("\nWelcome, "+name+"!"+"\nAge:"+age+"\nGender:"+gender+"\nCity:"+city);
		
	}
	
}
