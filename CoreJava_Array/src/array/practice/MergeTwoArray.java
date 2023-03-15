package array.practice;

import java.util.Scanner;

public class MergeTwoArray {

	public static void main(String[] args) {
		//int arr1[]= {10,20,30,40};
		//int arr2[]= {50,60,70,80,90,100};
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the 1st array size: ");
		int size1 = sc.nextInt();
		
		System.out.println("Enter the 2nd array size: ");
		int size2 = sc.nextInt();
		
		int arr1[]=new int [size1];
		int arr2[]=new int [size2];
		
		int size3=arr1.length+arr2.length;
		int merge[]=new int [size3];
		
		System.out.println("Enter the elements in 1st array:");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the elements in 2nd array:");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			merge[i]=arr1[i];
			
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			merge[arr1.length+i]=arr2[i];
			
		}
		
		System.out.println("Merged Array Elements: ");
		for(int i=0;i<merge.length;i++)
		{
			System.out.print(merge[i]+" ");
		}

	}

}
