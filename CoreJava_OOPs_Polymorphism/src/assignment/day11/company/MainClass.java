package assignment.day11.company;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
	
	{   
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the basic salary of Manager: ");
		float a=sc.nextFloat();
		System.out.println("Enter the basic salary of Trainee: ");
		float b=sc.nextFloat();
		
	     Manager emp1=new Manager(a);
         System.out.println("The total Salary of Manager is: "+emp1.employeeSalary());
         Trainee emp2=new Trainee(b);
         System.out.println("The total Salary of Trainee is: "+emp2.employeeSalary());
	}

}
