package array.assignment;

import java.util.Scanner;

public class FactorialSum {

	public static void main(String[] args) 
	{

    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the size of an array:");
    int size = sc.nextInt();
    
    int arr[]=new int[size];
    int arr1[]=new int[size];
    System.out.println("Enter the elements: ");
    for(int i=0;i<arr.length;i++)
    {
    	arr[i]=sc.nextInt();
    }
    
    int sum=0, count=0;;
    for(int i=0;i<arr.length;i++)
    {
    	int fact=1;
    	if(arr[i]>0 && arr[i]<10 )
    	{
    		for(int j=1;j<=arr[i];j++)
    		{    
    		  fact=fact*j;    
    		} 
    		arr1[i]=fact;
    		count++;
    	}    	  	
    }
 
    for(int i=0;i<arr1.length;i++)
    {
    	sum+=arr1[i];	
    }
    if(count!=0)
    {
    	System.out.println(sum);
    }
    else
    {
    	System.out.println("No positive and single digit numbers found in an array");
    }
   
	}

}
