package assignment.day3;

import java.util.Scanner;

public class Username {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name: ");
		String userName =sc.nextLine();
		
		System.out.println("Welcome "+userName+".");
	}

}
