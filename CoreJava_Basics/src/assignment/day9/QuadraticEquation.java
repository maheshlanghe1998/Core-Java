 package assignment.day9;

import java.util.Scanner;

public class QuadraticEquation {

	static double d;
	
	static double plusRoot(double a, double b,double c)
	{
		        
		return (-b+Math.sqrt(d))/(2*a);
		
	}
	
	static double minusRoot(double a, double b,double c)
	{
		
		return (-b-Math.sqrt(d))/(2*a);
		
	}
	static double dicriminant(double a, double b,double c)
	{
		 d= Math.pow(b,2)-4*a*c;
		return d;
	}
	
	static boolean isRealRoots()
	{
		if(d>0)
		{
		   return true;
		}
		else if(d==0)
		{
			return true;
		}
		
		return false;
		
	}
	public static void main(String[] args) {
		
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter the 1st value: ");
		double a= sc.nextDouble();
		System.out.println("Please Enter the 2nd value: ");
		double b= sc.nextDouble();
		System.out.println("Please Enter the 3rd value: ");
		double c= sc.nextDouble();
		
		System.out.println(plusRoot(a,b,c));
		System.out.println(minusRoot(a,b,c));
		System.out.println(dicriminant(a,b,c));
		//System.out.println(isRealRoots());
		
		
		//a=1  b=-4 c=4 ...root are real.
		
		
		
		  boolean x=true;
		  boolean y=false;
		  if(isRealRoots()==(x))
		  {
			  System.out.println("This is real number");
		  }
		  else if(isRealRoots()==(y))
		  {
			  System.out.println("This is real number");
		  }
		  else 
		  {
			  System.out.println("This is not real number");
		  }
        
	}

}
