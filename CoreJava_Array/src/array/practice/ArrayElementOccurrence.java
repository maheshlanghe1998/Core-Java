package array.practice;

import java.util.Scanner;

public class ArrayElementOccurrence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Array Size: ");
		int size = sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("please enter the Array Inputs: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		int count = 0;
		System.out.println("Enter the Number to find the occurrence of that Number: ");
		int num = sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				count++;
			}
		}
		System.out.println("The Occurrence of the Entered element: "+count);
		
		

	}

}
