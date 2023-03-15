package assignment.day6;

public class NumberPattern {

	public static void main(String[] args) 
	{
	  //pattern 1:
	  for(int i=1;i<=5;i++) //rows outer 
	  {
		  for(int j=1;j<=i;j++) //column inner for loop   2< =1 
		  {
			  System.out.print(i+" ");   // 1   
		  }
		  System.out.println(); 
	  }
	  
	//pattern 2:
	  System.out.println("\n");
	  
	  for(int i=1;i<=5;i++)
	  {
		  for(int j=1;j<=i;j++)
		  {
			  System.out.print(j+" ");
		  }
		  System.out.println();
	  }
	  
	//pattern 3:
	  System.out.println("\n");
	  
	  int k=0;
	  for(int i=1;i<=5;i++)
	  {
		  for(int j=1;j<=i;j++)  //2
		  {
			  k++;
			  System.out.print(k+" ");
		  }
		  System.out.println();
	  }
	  
	//pattern 4:
	  System.out.println("\n");
	  
	  for(int i=1;i<=5;i++)
	  {
		  for(int j=5;j>=i;j--)
		  {
			 
			  System.out.print(i+" ");
		  }
		  System.out.println();
	  }
	  
	  
	  
		//pattern 5:
		  System.out.println("\n");
		  
		  for(int i=1;i<=5;i++)
		  {
			  for(int j=5;j>=i;j--)
			  {
				 
				  System.out.print(j+" ");
			  }
			  System.out.println();
		  }
		  

			  //pattern 6:
		      System.out.println("\n");
			  int a=0;
			  for(int i=1;i<=5;i++)
			  { 
				  for(int j=5;j>=i;j--)
				  {
					  a++;
					  System.out.print(a+" ");
				  }
				  System.out.println();
			  }
			  
			  
			//pattern 7:
			  System.out.println("\n");
			  for(int i=1;i<=5;i++)
			  {
				  
				  for(int j=1;j<=i;j++)
				  {
					 
					  System.out.print(" ");
				  }
				  
				  for(int j=5;j>=i;j--)
				  {
					 
					  System.out.print(i);
				  }
				  System.out.println();
			  }
			  
			//pattern 8:
			  System.out.println("\n");
			  for(int i=1;i<=5;i++)
			  {
				 
				  for(int j=5;j>=i;j--)  //reverse with space
				  { 
					  System.out.print(" ");
				  }
				  
				  for(int j=1;j<=i;j++)
				  {	 
					  System.out.print(i);
				  }
				  System.out.println();
			  }
	}

}
