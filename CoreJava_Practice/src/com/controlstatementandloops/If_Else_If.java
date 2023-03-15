package com.controlstatementandloops;

import java.util.Scanner;

public class If_Else_If 
{
 public static void main(String args[])
 {
	//Example 1: 
		  Scanner sc =new Scanner(System.in); 
		  System.out.println("Enter the City: ");
		  String city =sc.next();
		 
	 if(city=="Pune")
	 {
		 System.out.println("City is Pune");
	 }
	 else if(city=="Mumbai")
	 {
		 System.out.println("City is Mumbai"); 
	 }
	 else if (city == "Noida") 
	 {  
		 System.out.println("city is noida");  
	 }
	 else if(city == "Agra") 
	 {  
		 System.out.println("city is agra");  
	 }
		
	 else 
	 {
		 System.out.println(city); 
	 }
	 
	 
	 // Example 2
	 System.out.println("********");
	  int  num=0;
	   if(num>0)
	   {
		   System.out.println("Positive Number");
	   }
	   else if(num<0)
	   {
		   System.out.println("Negative Number");
	   }
	   else
	   {
		   System.out.println("The Number is zero");
	   }
 }
}
