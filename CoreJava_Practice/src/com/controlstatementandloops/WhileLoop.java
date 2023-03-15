package com.controlstatementandloops;
import java.util.*;


public class WhileLoop {

	public static void main(String[] args) {
		
		//Example 1 : print number from 1-10.
		
		int i=1,num=10;
		
		while(i<=num)
		{
			System.out.println(i);
			i++;
		}
		
		//Example 2:sum of the positive number
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number: ");
		int number = sc.nextInt();
	     int  sum = 0;
	     while (number >=0)
	     {
	    	 //number  = number +sum;
	    	 sum = sum+number;
	    	 
	    	 System.out.println("Enter the number: ");
	 	     number = sc.nextInt();
	     }
	     
	     System.out.println("Sum : "+sum);
		sc.close();
	}

}
