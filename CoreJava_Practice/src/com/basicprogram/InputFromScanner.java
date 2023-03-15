package com.basicprogram;

import java.util.*;

public class InputFromScanner {

	public static void main(String args[])
	{
		
		int a, b;
		
        @SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
        
          //Input from Scanner for Byte 
        byte w,x,y;
        
        System.out.println("Please Enter the First Byte Value:");
         w =sc.nextByte();
        System.out.println("Please Enter the second Byte Value:");
         x =sc.nextByte();
         y= (byte)(w + x);
         System.out.println("The sum of Byte value is: "+y );
         
         
         //Input From Scanner for short
         short o,k,v;
         System.out.println("Please Enter the First Short value:");
         o =sc.nextShort();
         System.out.println("Please Enter the Second short value:");
         k =sc.nextShort();
         v=(short)(o+k);
         System.out.println("The Sum of Short value is: "+v);
        
        // Input from Scanner for integer
		 System.out.println("Please Enter 1st value:");
		 a = sc.nextInt();
		 
		 System.out.println("Please Enter 2nd value:");
		 b = sc.nextInt();
		 
		 int c = a+b;
		 System.out.println("Sum of Integer number is :"+c);
		 
		//Input from Scanner for Float 
		 
		 float  g,h;
		 System.out.println("Please Enter the 1st float value:");
		   g = sc.nextFloat();
		  System.out.println("Please Enter the 2nd float value:");
		  h= sc.nextFloat();
		  
		  float i= g+h;
		  System.out.println("The Sum of the floatig values: "+i);
		 
		  //Input from scanner for Double 
		  double d, e;
		  System.out.println("Enter 1st Double Value:");
		  d=sc.nextDouble();
		  System.out.println("Enter the second double value:");
		  e= sc.nextDouble();
		  
		 double f= d+e;
		 System.out.println("Sum of double values:"+f);
		  
		 //Input from scanner for long ;
		 long l,m,n;
		 System.out.println("Enter the First long value:");
		 l=sc.nextLong();
		 System.out.println("Enter the second long Value");
		 m=sc.nextLong();
		 n=l+m;
		 System.out.println("Sum of long Value:"+n);
		 
		 //Input from Scanner for String 
        // In 1st case of below code, it will only displaying 1st word 
		 String s ;
		 System.out.println("Please Enter String: ");
		 s= sc.next();
		 System.out.println("Printing one word only");
		 System.out.println(s);
		
		//In this case  it will print entire line except 1st word.
		System.out.println("Printing  Entrire line");
		s = sc.nextLine();
		System.out.println(s);
		
	}

}
