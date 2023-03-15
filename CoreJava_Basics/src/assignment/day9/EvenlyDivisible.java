package assignment.day9;

import java.util.Scanner;

public class EvenlyDivisible {
	
	
public static boolean evenlyDivisible(int a, int b) 
	
	{
	 if(a==0 ||b==0) 
	  { 
		  return false;  
	  }	 
	 else if(a%b==0)
	   {
		   return true;
	   }
	   else if(b%a==0)
	   {
		   return true;
	   }
	      
	   return false;
	   
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Number: ");
		int a= sc.nextInt();
		System.out.println("Enter The Second Number: ");
		int b= sc.nextInt();
			
		System.out.println(EvenlyDivisible.evenlyDivisible(a,b));
	}

	

}
