package array.revision;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size =sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter the element: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
        
		System.out.println("Enter the element that you want to search:  ");
		int num=sc.nextInt();
	    for(int i=0;i<arr.length;i++)
	    {
	    	if(arr[i]==num)
	    	{
	    		System.out.print("the element found at: "+i+" Position");
	    	}
	    }
	}

}
