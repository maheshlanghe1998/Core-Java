package basics;

import java.util.Scanner;

public class LargestNumber 
{
	public static void main(String agrs[]) {
		
	    Scanner sc =new Scanner(System.in);
        System.out.println("Enter the 1st Num: ");
        int a= sc.nextInt();
        System.out.println("Enter the 2nd Num: ");
        int b= sc.nextInt();
        System.out.println("Enter the 3rd Num: ");
        int c= sc.nextInt();
        
        if((a>b) || (a>c))
        {
        	System.out.println("A is Large");
        }
        else if(b>c)
        {
        	System.out.println("B is Large");
        }
        else
        {
        	System.out.println("C is Large");
        }
	}
  
}
