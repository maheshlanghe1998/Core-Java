package exceptionhandling.unchecked.practice;

public class ArithmeticExceptionDemo 
{
     public static void main(String args[])
     {
    	 try
 	    {
 	    	int a=10;
 	    	int b=0;
 	    	System.out.println("Division is: "+a/b);
 	    	
 	    }
 		catch(Exception e)
 		{   
 			
 			//System.out.println("don't divide by zero");// manual way to print exception
 			System.out.println(e);//another manual way to print 
 			//e.printStackTrace(); // exception name+ description+ line number
 	        //System.out.println(e.toString());// exception name+ description
 	        //System.out.println(e.getMessage());//exception description
 	        
 		}
     }

}
