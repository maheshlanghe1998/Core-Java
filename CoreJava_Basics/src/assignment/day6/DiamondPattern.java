package assignment.day6;

public class DiamondPattern {

	public static void main(String[] args) {
		
		//Pattern 1
		  
		  for(int i=1;i<=5;i++)
		  {
			  for(int j=5;j>=i;j--)
			  { 
				  System.out.print(" ");
			  }
			  for(int j=1;j<=i;j++)
			  { 
				  System.out.print("*");
			  }
			  for(int j=1;j<=i;j++)
			  {
				 
				  System.out.print("*");
			  }
			  
			  System.out.println();
		  }
		    
		  for(int i=1;i<=5;i++)
		  {
			  
			  for(int j=0;j<=i;j++)
			  {
				 
				  System.out.print(" ");
			  }
			  
			  for(int j=4;j>=i;j--)
			  {
				 
				  System.out.print("*");
			  }
			  
			  for(int j=4;j>=i;j--)
			  {
				 
				  System.out.print("*");
			  }
			 System.out.println();
		  }
		  
		 //pattern 2 
		  System.out.println("//************************//");
		  
		  
		  for(int i=1;i<=16;i++)
		  {
			  for(int j=16;j>=i;j--)
			  {
				 
				  System.out.print(" ");
			  }
			  for(int j=1;j<=i;j++)
			  {
				 
				  System.out.print("* ");
			  }
			  System.out.println();
		  }
		  
		  for(int i=1;i<=16;i++)
		  {
			  
			  for(int j=0;j<=i;j++)
			  {
				 
				  System.out.print(" ");
			  }
			  
			  for(int j=15;j>=i;j--)
			  {
				 
				  System.out.print("* ");
			  }
			  System.out.println();
		  }
	}

}
