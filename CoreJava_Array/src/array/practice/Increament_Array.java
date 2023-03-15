package array.practice;

import java.util.Scanner;

public class Increament_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Array size: ");
		int size =sc.nextInt();
		
		int arr[]=new int [size];
		
		System.out.println("Enter the Elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			arr[i]++;
			
		}
		
		System.out.println("After Incrementing array elements:");
		
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.print(arr[i]+" ");
			
		}
		
		

	}

}
