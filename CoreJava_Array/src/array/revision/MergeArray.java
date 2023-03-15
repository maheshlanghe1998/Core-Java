package array.revision;

import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of Array-1: ");
		int size1=sc.nextInt();
		System.out.println("Enter the size of Array-2: ");
		int size2=sc.nextInt();
		int size3=size1+size2;
		
		int arr1[]=new int[size1];
		int arr2[]=new int[size2];
		int arr3[]=new int[size3];
		
		System.out.println("Enter the element of 1st array:");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the element of 2nd array:");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i];
		
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			arr3[arr1.length+i]=arr2[i];
		
		}
		System.out.println("Merged Array: ");
		for(int i=0;i<arr3.length;i++)
		{
		System.out.print(arr3[i]+" ");
		}
	}

}
