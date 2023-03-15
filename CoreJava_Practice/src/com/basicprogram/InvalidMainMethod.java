package com.basicprogram;

public class InvalidMainMethod {
	
	/*public void main(String []agrs)
	static void main(String args[])
    Above  both Methods will compile but will not run. It will through below error.
    Error: Main method not found in class MainMethod, please define the main method as:
   public static void main(String[] args)
	*/
	
	/*public void static main(String args[]) 
	  it will gives compile time error.
	  */
	
	/*abstract public static void main(String args[])
	the above signature will gives compile time error because abstract method does not have body 
	*/
	
	public static void main(String args[])
	{
		System.out.println("Hello World...");
	}

}