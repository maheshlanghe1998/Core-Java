package array.practice;

import java.util.Scanner;

public class Posittion {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Array size: ");
		int size =sc.nextInt();
		
		int arr[]=new int [size];
		
		System.out.println("Enter the Elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the position that you want to check number: ");
		int k = sc.nextInt();
		
		System.out.println("The Number is: "+arr[k-1]);
	}

}
