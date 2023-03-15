package com.array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
	
		int arr []= {10,20,30,40,50};
		
		System.out.println("Original Array : "+Arrays.toString(arr));
		
		System.out.print("Reverse Array : ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	
	}

}

