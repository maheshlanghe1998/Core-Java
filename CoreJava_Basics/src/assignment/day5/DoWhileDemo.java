package assignment.day5;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		
		//Example 1: printing the numbers from 1 to 10.
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number ");
		int num=sc.nextInt();
		do
		{
			System.out.println(num);
			num++;
			
		}while(num<=10);
		
		//Example 2: printing the numbers in reverse order(10 to 1)
		System.out.println("\n");
		System.out.println("Please enter the number ");
		int n=sc.nextInt();
		do
		{
			System.out.println(n);
			n--;
			
		}while(n>=1);
	}
	

}
