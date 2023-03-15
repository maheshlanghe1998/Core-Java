package com.basics;

public class FindMaxMin {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,45,48,85,12};
		 
		int max=arr[0],min=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		System.out.println("Max Element: "+max);
        
		
		for(int j=1;j<arr.length;j++)
		{
			if(arr[j]<min)
			{
				min=arr[j];
			}
			
		}
		System.out.println("Min Element: "+min);
	}

}
