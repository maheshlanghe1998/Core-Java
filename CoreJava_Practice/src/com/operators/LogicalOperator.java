package com.operators;

public class LogicalOperator 
{
//logical operators are &&,||,! will always gives boolean(true,false) results.
public static void main(String args[])
{
	int a= 10;
	int b= 20;
	int c= 30;
	// logical AND (&&)
	System.out.println(a<b && b<c);
	System.out.println(a>b && a<c);
	//logical OR (||)
	System.out.println(a<b || b<c);
	System.out.println(a>b || a<c);
	//logical NOT(!)
	System.out.println(!(a==b || a==c));
	
}
	
}
