package assignment.day11.libraryapp;

public class Children extends Library

{    
	String bookCategory;
	
	public Children(String firstName, String lastName, String mob, String mailId, String password, int age, String bookCategory) {
		super(firstName, lastName, mob, mailId, password, age);
		this.bookCategory=bookCategory;
	}
	
	 boolean validateChildRegister()
	 {   
		 boolean x= false;
		 
		 if((age<12) && (bookCategory.equals("Kids")))
		 {
			 return x=true;
			 
			
		 }
		  return x;
	 }
	
	
}
