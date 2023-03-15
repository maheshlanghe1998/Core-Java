package assignment.day3;

import java.util.Scanner;
import java.util.stream.IntStream;

public class DisplayCharacters {

	public static void main(String[] args) {
		//int a='A';
		//char ch = 65;
		
		//System.out.println(ch);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Digits: ");
		//IntStream i=sc.next().chars();
		//char ch=sc.next().charAt(0);
		
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int d= sc.nextInt();
		
		//by explicit type casting 
		char c1= (char)a;
		char c2= (char)b;
		char c3= (char)c;
		char c4= (char)d;
		
		System.out.println(a+"-"+c1);
		System.out.println(b+"-"+c2);
		System.out.println(c+"-"+c3);
		System.out.println(d+"-"+c4);
	}

}
