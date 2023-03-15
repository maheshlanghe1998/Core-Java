package array.revision;

import java.util.Scanner;

public class MaxMinElement {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("Enter the Size: ");
		int size =sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the array element: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum number: "+max);
		
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum number: "+min);
		
		
		int sum = max+min;
		System.out.println("The Sum of Max & Min: "+sum);

	}

}
