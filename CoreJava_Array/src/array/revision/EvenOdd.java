package array.revision;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the size: ");
		int size =sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("Even numbers: ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
			
		}
		
		System.out.println("\nodd numbers: ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]+" ");
			}
			
		}
		

	}

}
