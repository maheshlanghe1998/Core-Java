package array.assignment;

import java.util.Scanner;

public class HighestMarks {

	public static void main(String[] args) {
		
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter array size: ");
	int size=sc.nextInt();
	int arr []=new int [size];
	int highestMark=arr[0];
    System.out.println("Array Input Element: ");
	for(int i=0;i<size;i++)
	{
	    arr[i]=sc.nextInt();
	  
	}
	if(size<6)
	{
		System.out.println("Invalid Mark");
	}
	else 
	{
	for(int i=0;i<size;i++)
	{
	 if(arr[i]<0)
	 {
		 System.out.println("Invalid Mark"); 
	 }
	 else if(size==6 && arr[i]>=0 && arr[i]>highestMark )
	{
    	highestMark=arr[i];
	}
    
	}
	System.out.println("Highest marks is "+highestMark);
	
	}
	}

}
