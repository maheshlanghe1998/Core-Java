package assignment.day6;

public class PartialDiamondPattern {

	public static void main(String[] args) {
		
		//pattern 1 :
		 
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
			  System.out.println();
		  }
		  
		 System.out.println("//*****************//");
		// Pattern 2: 
		  for(int i=1;i<=5;i++)
			{
				  for(int j=1;j<=i;j++)
				  {
					 
					  System.out.print("*");
				  }
				  System.out.println();
			  }
			  
			  for(int i=1;i<=5;i++)
			  {
				  for(int j=4;j>=i;j--)
				  {
					 
					  System.out.print("*");
				  }
				  System.out.println();
			  }
	}

}
