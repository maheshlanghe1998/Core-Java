package com.string.assignment;

import java.util.Scanner;

public class LengthOfString {

	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the input ");
	        String str = sc.nextLine();
	       
	        
	        int count = 0;
	        
	        for(int i=0 ; i<str.length(); i++)
	        {
	          
	            if((str.charAt(i)>='a' && str.charAt(i)<='z') 
	            		|| (str.charAt(i)>='A' && str.charAt(i)<='Z') || str.charAt(i)==' ')
	            {
	                count++;
	            }
	            
	            else
		        {
		            System.out.println("Invalid String");
		            System.exit(0);
		        }
	        }
	        
	        if(count !=0)
	        {
	            System.out.println("No of characters is: "+str.length());
	        }
	        
	    }

	}


