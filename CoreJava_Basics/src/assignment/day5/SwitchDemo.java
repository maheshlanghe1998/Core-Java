package assignment.day5;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		 
		Scanner sc= new Scanner(System.in);
		 System.out.println("Please Enter the character: ");
		char ch =sc.next().charAt(0);
		
		switch(ch)
		{
		//case 'a','e','i','o','u': 
		case 'a':
			System.out.println("Vowel");
		    break;
		
		default:
			System.out.println("Consonant");
		
		}

	} 

}
