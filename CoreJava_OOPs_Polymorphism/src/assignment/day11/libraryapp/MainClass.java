package assignment.day11.libraryapp;

import java.time.LocalDateTime;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
	{  
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Adults or Children");
		String a=sc.next();
		 
		if(a.equals("Adults"))
		{
		System.out.println("Please Enter user Details:");
		 String firstName=sc.next();
		 String lastName=sc.next();
		 String mob=sc.next();
		 String mailId=sc.next();
		 String password=sc.next();
		 int age=sc.nextInt();
		 
		 String bookCategory=sc.next();
		
		Adults ad= new Adults( firstName, lastName,  mob,  mailId,  password,  age, bookCategory);
		
		if(ad.validateAdultRegister())
		{
	       System.out.println("Congratualations "+firstName+"! You Valid User And Registered As Adult User.");
		}
        else
        {
	      System.out.println("Sorry, You Are Invalid User For Adults Registration.");
        }
		
		System.out.println("\n\tUser Registration Details\n");
		ad.displayInfo();
		
		if(bookCategory.equals("Fiction"))
	       {
	    	   System.out.println("\nHello, "+firstName+"! You Have Borrow Adults Category Books On "+LocalDateTime.now()+" and you need to returned within 10 days.");
	       }
      } 
		
		
		if(a.equals("Children"))
		{
		System.out.println("Please Enter user Details:");
		 String firstName=sc.next();
		 String lastName=sc.next();
		 String mob=sc.next();
		 String mailId=sc.next();
		 String password=sc.next();
		 int age=sc.nextInt();
		 
		 String bookCategory=sc.next();
		 
		 Children cd= new Children( firstName, lastName,  mob,  mailId,  password,  age, bookCategory);
		
		
		
		if(cd.validateChildRegister())
		{
	       System.out.println("Congratualations "+firstName+"! You Valid User And Registered As Child User.");
	       
	       
		}
        else
        {
	      System.out.println("Sorry, You Are Invalid User For Child Registration.");
        }
		
		System.out.println("\n\tUser Registration Details\n");
		cd.displayInfo();
		
		if(bookCategory.equals("Kids"))
	       {
	    	   System.out.println("\nHello,"+firstName+"! You Have Borrow Child Category Books On "+LocalDateTime.now()+" and you need to returned within 10 days.");
	       }
	}
		

	}
}
