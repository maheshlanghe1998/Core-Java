package array.assignment;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) 
	{
        Scanner sc =new Scanner(System.in);
		int sum=0, size=10;
		int arr[]=new int[size];
		System.out.println("Enter the elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		
		float average=sum/size;
		
		System.out.println("Average of all the element: "+average);

	}

}
