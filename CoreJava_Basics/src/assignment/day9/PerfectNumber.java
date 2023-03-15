package assignment.day9;

import java.util.Scanner;

public class PerfectNumber {
	static int sum=0;
	
	static boolean perfectNum(int n)
	{
	  for(int i=1;i<n;i++)
	  {
		  if(n%i==0)
		  {
			  sum+=i;  
		  }		  
	  }
	  
	  if(sum==n)
	  {
		  return true;
	  }
	return false;
	}

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("please Enter the number: ");
		int n=sc.nextInt();
		
		
		boolean a=true;
		
		
		if(a==perfectNum(n))
		{
			System.out.println("This is Perfect Number");
		}
		else
		{
			System.out.println("This is not Perfect Number");
		}
	}

}
