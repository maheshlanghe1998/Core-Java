package array.assignment;

import java.util.Scanner;

public class CumulativeSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int size = sc.nextInt();
		if(size<=0 || size>20)
		{
			System.out.println("Invalid Range");
		}
		else
		{
		int sum=0;
		int arr[]= new int[size];
		int arr1[]= new int[size];
		System.out.println("Enter the elements: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<size;j++)
		{
			sum+=arr[j];
			arr1[j]=sum;
			
		}
		
		for(int k=0;k<size;k++)
		{
			System.out.print(arr1[k]+" ");
		}
		
	}
 
  }
}
