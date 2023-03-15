package array.assignment;

import java.util.Scanner;

public class SortFirstAndSecondHalf {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the Size: ");
		int size=sc.nextInt();
		if(size<=0)
		{
			System.out.println("Array size should be greater than 0");
		}
		else
		{
			int arr[]=new int[size];
			System.out.println("Enter all array element");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();	
			}
			
			for(int i=0;i<arr.length/2;i++)
			{
				for(int j=i+1;j<arr.length/2;j++)
				{
					int temp=0;
					
					if(arr[i]>arr[j])
					{
						temp= arr[i];
						arr[i]= arr[j];
						arr[j]= temp;	
					}
				}
			}
			
			for(int i=arr.length/2;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					int temp=0;
					
					if(arr[i]<arr[j])
					{
						temp= arr[i];
						arr[i]= arr[j];
						arr[j]= temp;	
					}
				}
			}
			
			for(int i=0;i<arr.length;i++)
			{  
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}
