package array.practice;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the array size: ");
	    int size = sc.nextInt();
	    
	    int arr[]=new int [size];
	    System.out.println("Enter the array elements: ");
	    for(int i =0;i<arr.length;i++)
	    {
	    	arr[i]=sc.nextInt();	
	    }
	    System.out.println("Enter Element that you want to search");
	    int num = sc.nextInt();
	    for(int i =0;i<arr.length;i++)
	    {
	    	if(arr[i]==num)
	    	{
	    		System.out.println("The element found at: "+i);
	    	}
	    }
	}

}
