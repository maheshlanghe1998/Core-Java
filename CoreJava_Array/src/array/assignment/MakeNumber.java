package array.assignment;

import java.util.Scanner;

public class MakeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size = sc.nextInt();
		if(size<=0)
		{
			System.out.println("Invalid array size");
		}
		else
		{
		int arr[]=new int [size];
		
		int con =arr[0];
		
		System.out.println("Enter the array elements:");
		
		for(int i=0;i<size;i++)
		{
			arr[i]= sc.nextInt();	
		}
		
		for(int i=0;i<size;i++)
		{
			if((arr[i]%2)==0 && arr[i]<10 && arr[i]>=0)
			{
				int num =(int)Math.floor(Math.log10(arr[i])+1);
				
				con =con*(int)Math.pow(10, num);
				
				con+=arr[i];
			}		
		}
		System.out.println("\n"+con);
		}
	}

}
