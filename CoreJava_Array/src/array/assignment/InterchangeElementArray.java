package array.assignment;

import java.util.Scanner;

public class InterchangeElementArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int i,size;
		System.out.println("Enter the number of elements in the first array :");
		 size=sc.nextInt();
		if(size<=0 || size>20)
		{
			System.out.println("Invalid range");
		}
		else
		{
		int arr1[]=new int [size];
		
		System.out.println("Enter the elements in the first array");
		for( i=0;i<size;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number of elements in the second array :");
		 size=sc.nextInt();
		
		int arr2[]=new int [size];
		
		System.out.println("Enter the elements in the second array");
		for( i=0;i<size;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		for( i=0; i<size;i++)
		{
		arr1[i]=arr1[i]+arr2[i]; 
		arr2[i]=arr1[i]-arr2[i]; 
		arr1[i]=arr1[i]-arr2[i]; 
		
		}
		
		if(arr1.length !=arr2.length)
		{
			System.out.println("Unable to swap size differs");
		}
		else
		{
			System.out.println("The first array after swapping is: ");
			printArray(arr1,size);
			System.out.println("\nThe second array after swapping is: ");
			printArray(arr2,size);
		}
		}
		
	}

	public static void printArray(int[] arr, int size) {
		
		for(int num: arr)
		{
			System.out.print(num+" ");
		}
		
	}
}
