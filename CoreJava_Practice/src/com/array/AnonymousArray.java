package com.array;

import java.util.Arrays;

public class AnonymousArray {

	public static void main(String[] args) {
		
		ArrayMethod(new int []{10,20,30,40,50,60});
		
	}

	public static void ArrayMethod(int[] arr) {
		
		System.out.println(Arrays.toString(arr)); 
		
		//OR
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	
	}

}
