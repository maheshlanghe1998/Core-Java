package com.string.classprograms;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		String str = new String();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String ");
        str = sc.nextLine();
        int count =1;
        
        for(int i=0;i<str.length();i++)
        {
        	if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
        	{
        		count=count+1;
        		
        	}
        }
        System.out.println("Total words = "+count);
	}

}
