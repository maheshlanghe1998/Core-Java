package assignment.day9;

import java.util.Scanner;

public class DoubleToInt {
	
	public static int find(String s, double d)
	{
		return (int) d;
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values: ");
		double d =sc.nextDouble();
		
		String s=sc.next();
		
		System.out.println(find(s,d));
		
	}

}
