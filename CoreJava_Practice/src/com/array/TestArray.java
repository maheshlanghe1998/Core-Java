package com.array;

import java.util.Arrays;

public class TestArray {
 
		public static void main(String args[])
		{
			int arr[]= new int[5]; //Array declaration
			arr[0]=10;//Array Initialization
			arr[1]=20;
			arr[2]=30;
			arr[3]=40;
			arr[4]=50;
			
			
			 System.out.println(Arrays.toString(arr)); //printing the array on console.
			 
			 //OR
			 
			for(int i=0;i<arr.length;i++)
			{
			  System.out.print(arr[i]+" "); 	
			
			}
		}
}
