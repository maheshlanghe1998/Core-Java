package com.operators;

public class LogicalOperator1 {

	public static void main(String[] args) {
		String Citizen = "USA";
		int age = 25;
		
		if(Citizen=="Indian" && age>=18)
		{
			System.out.println("You can Vote ");
		}
		else 
		{
			System.out.println("You can not vote");
		}
		
		System.out.println("****************************");
		String Langauge1 = "Java"
;
		String Langauge2 = "Python";
		
		if(Langauge1 =="Java" || Langauge2=="xyz")
		{
			System.out.println("You are Programmer ");
		}
		else 
		{
			System.out.println("You are not Programmer");
		}
		
		
	}

}
