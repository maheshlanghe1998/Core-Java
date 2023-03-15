package array.practice;

import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
	    int size =sc.nextInt();
	    
	    int arr []=new int [size];
	    
	    System.out.println("Enter the Input: ");
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i] = sc.nextInt();
	    }
	    
	    System.out.print("\nArray Elements are: ");
	    for (int i=0;i<arr.length;i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }
	    
	}

	}


