package assignment.day11.libraryapp;

public class Library 
{
 String firstName;
 String lastName;
 String mob;
 String mailId;
 String password;
 int age;
 
 public Library(String firstName, String lastName, String mob, String mailId, String password, int age) 
 {
	
	this.firstName = firstName;
	this.lastName = lastName;
	this.mob = mob;
	this.mailId = mailId;
	this.password = password;
	this.age = age;
}
 
 
 boolean validateChildRegister()
 {
	return false;
	 
 }
 
 boolean validateAdultRegister()
 {
	return false;
	
	 
 }
 
 
 void displayInfo()
 {
	 System.out.println(" First Name   : "+firstName);
	 System.out.println(" last Name    : "+lastName);
	 System.out.println(" Mobile Number: "+mob);
	 System.out.println(" Mail Id      : "+mailId);
	 System.out.println(" your Age     : "+age);
 }
 
}
