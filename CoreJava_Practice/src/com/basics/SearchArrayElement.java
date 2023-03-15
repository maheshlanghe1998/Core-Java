package com.basics;

import java.util.Scanner;

public class SearchArrayElement {

	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int size = sc.nextInt();
     int arr[]= new int [size];
     for(int i=0;i<arr.length;i++)
     {
    	 System.out.println("Enter the Element: ");
    	 arr[i]=sc.nextInt();
     }
     
     System.out.println("Element to search: ");
     int x= sc.nextInt();
     
     for(int j = 0;j<arr.length;j++)
     {
    	 if(arr[j]==x)
    	 {
    		 System.out.println("The element found at: "+j);
    	 }
     }
	}

}
