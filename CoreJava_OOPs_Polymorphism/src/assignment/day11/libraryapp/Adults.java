package assignment.day11.libraryapp;

public class Adults extends Library

{
      String bookCategory;
      
	public Adults(String firstName, String lastName, String mob, String mailId, String password, int age,String bookCategory) 
	{
		super(firstName, lastName, mob, mailId, password, age);
		
		this.bookCategory=bookCategory;
		
	}

	  boolean validateAdultRegister()
	 {    
		  boolean y=false;
		 if((age>12) && (bookCategory.equals("Fiction")))
		 {
			 return y=true;
		 }
		  return y;
	 }
	  
	  
}
