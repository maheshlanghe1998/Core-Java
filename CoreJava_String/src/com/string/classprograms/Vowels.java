package com.string.classprograms;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		Scanner sc =new Scanner(System.in);
		String str =sc.nextLine();
		
		
		int count = 0;
		char ch;
		 System.out.print("Vowels in given String are: ");
		for(int i=0;i<str.length();i++)
		{
			 ch = str.charAt(i);
			
			
			if(ch=='a' ||ch=='i'|| ch=='o'||ch=='u'||ch=='e')
			{
				count++;
				System.out.print(ch+" ");
				
			}
		}
		
		System.out.println("\nNo of vowels are: "+count);

	}

}
