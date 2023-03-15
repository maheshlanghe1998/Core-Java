package array.revision;

import java.util.Scanner;

public class Occurence {

	public static void main(String[] args) {
		int count=0;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		
		System.out.println("Enter the element: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
        
		System.out.println("enter the element of which frequency you want to ");
		int frequency =sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(frequency==arr[i])
			{
				count++;
			}
		}
		
		System.out.println("The Entered element occurenced :"+count+" times.");
	}

}
