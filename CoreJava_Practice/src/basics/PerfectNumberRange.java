package basics;

import java.util.Scanner;

public class PerfectNumberRange {

	public static void main(String[] args) 
	{
	    Scanner sc =new Scanner(System.in);
	    System.out.println("Enter a Number");
	    int num=sc.nextInt();
	    
		System.out.println("\nPerfect Numbers between 1 to "+num+" are: ");
	    int count=0,sum1=0;
	    for(int i=1;i<num;i++)
	    {
	    	int sum=0;
	    	for(int j=1;j<i;j++)
	    	{
	    		if(i%j==0)
	    		{
	    			sum+=j;
	    		}
	    	}
	    	if(sum==i)
	    	{
	    		System.out.print(i+" ");
	    		count++;
	    		sum1+=i;
	    	}
	    }
	    System.out.println("\n\ncount of Perfect Numbers between 1 to " + num + " is: " + count);
		System.out.println("\nsum of Perfect Numbers between 1 to " + num + " is: " + sum1);

	}

}
