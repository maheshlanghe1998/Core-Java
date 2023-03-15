package array.assignment;

import java.util.Scanner;

public class SumMaxMin {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size =sc.nextInt();
		if(size<=0)
		{
			System.out.println("Invalid Array Size");
		}
		else
		{
		int arr[]=new int[size];
			
		System.out.println("Enter the elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();	
		}
		
		int max =arr[0],min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
	        
		int	sum =max+min;
	    System.out.println("The sum of max and min element of array: "+sum);
		}
	}

}
