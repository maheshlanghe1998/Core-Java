package com.string.assignment;

import java.util.Scanner;
public class UniqueCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str=sc.nextLine();
		
		String str1=str.replaceAll("\\s", "");
		
		char arr[]=str1.toCharArray();
		
		 int count=0;boolean flag1=false,flag2=false;
		for(int i=0;i<arr.length;i++)
		{
			if(!(Character.isAlphabetic(str1.charAt(i))))
			{
				flag1=true;
			}
			else
			{
			boolean flag =true;
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j && (arr[i]==arr[j]))
				{
					count++;
					flag=false;
					break;
					
				}
				
			}
			if(flag)
			{
				System.out.print(arr[i]+" ");
			}
			/*
			else if(count!=0)
				{
					 flag1=true;
				}
				*/
		}
			
		}
		if(flag1==true)
		{
			System.out.println("Invalid Sentence");
		}
	/*	
	if(flag2==true)
	{
		System.out.println("No unique characters");
	}
	
    */
		}
	}


