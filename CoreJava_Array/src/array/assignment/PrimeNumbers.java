package array.assignment;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
        int size = sc.nextInt();
		int array[]=new int [size];
		int array1[]=new int [size];
		System.out.println("Enter prime number:");
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
	    }
		
		
		for(int i=array.length-1;i>=0;i--)
		{
			 array1[i]=array[i];
			 
		}
		System.out.println("Reverse Array: ");
		for(int i=array1.length-1;i>=0;i--)
		{
			 System.out.print(array1[i]+" ");
		}
		
	   
		
	}	
}