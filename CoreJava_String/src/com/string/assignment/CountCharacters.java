package com.string.assignment;

import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		int count =0;
		
		for(int i =0;i<name.length();i++)
		{
        
		     if((name.charAt(i)==' ') || (name.charAt(i)>='A') && (name.charAt(i)<='Z' )
					|| (name.charAt(i)>='a')&&(name.charAt(i)<='z'))
			{
				count++;
				
			}
		     else
			{
				System.out.println("Invalid input");
				System.exit(0);
			}
				
		}
		if(count !=0)
		{
			System.out.println(name+" has "+count+" characters");
		}
		 
		}

}
