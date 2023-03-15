package assignment.day3;

import java.util.Scanner;

public class Message {

	public static void main(String[] args) {
		//Static Way:
		String msg="Welcome to object oriented programming";
		System.out.println(msg);
		
		//Dynamic Way: 
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter your Message: ");
		String msg1 = sc.nextLine();
		System.out.println(msg1);
	}

}
