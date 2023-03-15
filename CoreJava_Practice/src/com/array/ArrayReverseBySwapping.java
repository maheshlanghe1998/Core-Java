package com.array;

import java.util.Arrays;

public class ArrayReverseBySwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[] = {10,20,30,40,50,60};
       System.out.println("Original array: "+Arrays.toString(arr));
       reverseArray(arr,arr.length);
       
	}

	 static void reverseArray(int[] arr, int size) {
		 
		int i, temp;
		for(i=0;i<=size/2;i++)
		{
			temp=arr[i];
			arr[i]=arr[size-i-1];
			arr[size-i-1]=temp;
			
		}
		System.out.println("Reverse Array: "+Arrays.toString(arr));
		
	}


}
