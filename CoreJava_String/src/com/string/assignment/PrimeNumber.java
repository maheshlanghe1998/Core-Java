package com.string.assignment;

import java.util.Scanner;

public class PrimeNumber {

	
		public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the inputs: ");
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	      
	        if(a<b && a>0 && b>0)
	        {
	            while(a<=b)
	            {
	                if(checkPrime(a))
	                {
	                    System.out.print(a+" ");   
	                }
	                a++;
	            }
	        }
	        else
	        {
	            System.out.println("Provide valid input");
	        }
	    }
	    
	    public static boolean checkPrime(int num)
	    {
	    	int count=0;
	    	 
	        for (int i = 1; i <= num; i++) 
			{
	        	 
				if (num % i == 0) 
				{
					count++;

				}
				 
			}
	        if(count==2)
			{
				return true;
			}
			return false;

	     
	        }
	        
	    }
