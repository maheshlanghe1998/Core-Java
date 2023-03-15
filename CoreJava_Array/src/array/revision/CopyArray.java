package array.revision;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size=sc.nextInt();
		
		int arr1[]=new int[size];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
			
		}
		
		System.out.println("Original Array: ");
		for(int arrays: arr1)
		{
			System.out.print(arrays+" ");
		}
		
		int arr2[]=arr1;
		
		System.out.println("\nCopy Array: ");
		for(int array: arr2)
		{
			System.out.print(array+" ");
		}
		

	}

}
