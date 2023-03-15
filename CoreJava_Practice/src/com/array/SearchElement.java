package com.array;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size =sc.nextInt();
		
		int number[] = new int [size];
		
		
		for(int i=0;i<number.length;i++)
		{
			System.out.println("Input Element: ");
			number[i]=sc.nextInt();
			
		}
		
		System.out.println("Take a Element to search ");
		int x=sc.nextInt();
		
		for(int j=0;j<number.length;j++)
		{
			if(number[j]==x)
			{
				System.out.println("The element found at: "+j);
			}
		}
		
	}

}
