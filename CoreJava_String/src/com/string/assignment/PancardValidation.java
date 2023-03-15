package com.string.assignment;

import java.util.Scanner;

public class PancardValidation {
	
	public static String validatePan(char charArray[])
	{
		if(charArray.length==10)
		{
            
			for(int i=0;i<10;i++)
			{
				if((i>=0 &&i<=4) && (charArray[i]<'A' || charArray[i]>'Z'))
				{
					return "Invalid Pan NO";
				}
				else if((i>=5 &&i<=8) && (charArray[i]<48 || charArray[i]>57))
				{
					return "Invalid Pan NO";
				}
				else if((i==9) && (charArray[i]<'A' || charArray[i]>'Z'))
				{
					return "Invalid Pan NO";
				}
			}
		}
		else
		{
			return "Invalid PAN NO";	
		}
		
		return "Valid PAN NO";
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the PAN No:");
		String pan = sc.next();	
		char charArray[]=pan.toCharArray();
		
		System.out.println(validatePan(charArray));

	}

}
