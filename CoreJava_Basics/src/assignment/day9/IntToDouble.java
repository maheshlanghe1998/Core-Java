package assignment.day9;

import java.util.Scanner;

public class IntToDouble {
	
	static double translate (int a)
	{
		return a;
		
	}

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Integer Number: ");
		int a =sc.nextInt();
		
		System.out.println(translate(a));
	}

}
