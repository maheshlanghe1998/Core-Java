package array.practice;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		int i;
		String arr[]=new String[size];
		
		System.out.println("Enter the input: ");
		for( i=0;i<arr.length;i++)
		{
			 arr[i]=sc.next();
		}
		
		System.out.println("\nArray elements are as: ");
		for( i=0;i<arr.length;i++)
		{
			
			   System.out.println(arr[i]);
			
			
		}
		
	
        
	}

}
