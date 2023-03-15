package com.operators;
import java.util.*;

public class ArithmeticOperator1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		//addition
		int a,b;
		System.out.println("Enter the first value: ");
		 a= sc.nextInt();
		 System.out.println("Enter the second value: ");
		 b=sc.nextInt();
		 int  c = a+b;
		 System.out.println("The sum is: "+c);
		
		//Subtraction
		 System.out.println("Enter the First Value: ");
         a =sc.nextInt();
         System.out.println("Enter the Second Value: ");
         b=sc.nextInt();
         int s = a-b;
         System.out.println("The Sub is: "+s);
         
         //multiplication
         System.out.println("Enter the First value: ");
         a=sc.nextInt();
         System.out.println("Enter the Second value: ");
         b=sc.nextInt();
         int m = a*b;
         System.out.println("The Mul/ is: "+m);
         
         //Division
         System.out.println("Enter the First value: ");
         a= sc.nextInt();
         System.out.println("Enter the Second Value: ");
         b=sc.nextInt();
         int d =a/b;
         System.out.println("The Div. is: "+d);
         
         //Reminder
         
        System.out.println("Enter the First value: ");
        a=sc.nextInt();
        System.out.println("Enter the Second value: ");
        b=sc.nextInt();
        int r = a/b;
        System.out.println("The reminder is: "+r);
     
	}

}
