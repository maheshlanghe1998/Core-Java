package com.array;

public class MinMaxFromArray {
  
	public static void main(String[] args) {
		int arr[]= {10,20,30,60,40,50};
		getMin(arr);
		getMax(arr);
	}

	public static void getMin(int[] arr) {
		int min = arr[0];
		for(int i=0;i<arr.length;i++)
		{
		    if(min>arr[i])
			min=arr[i];
	    }
			System.out.println(min);
	}
	
	
	public static void getMax(int arr[])
	{
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
			
		}
		System.out.println(max);
	}
	

}
