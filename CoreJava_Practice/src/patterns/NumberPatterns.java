package patterns;

public class NumberPatterns {

	public static void main(String[] args) {
		//pattern 1: 
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}

		
		       //pattern 2: 
		       System.out.println("\n");
				for(int i=1;i<=5;i++)
				{
					for(int j=1;j<=i;j++)
					{
						System.out.print(j);
					}
					System.out.println();
				}
				
			      //pattern 3: 
			       System.out.println("\n");
					for(int i=1;i<=5;i++)
					{
						for(int j=5;j>=i;j--)
						{
							System.out.print(i);
						}
						System.out.println();
					}
					
					//pattern 4: 
				       System.out.println("\n");
						for(int i=1;i<=5;i++)
						{
							for(int j=5;j>=i;j--)
							{
								System.out.print(j);
							}
							System.out.println();
						}
						
						
						//pattern 5: 
						System.out.println("\n");
						int k=0;
						for(int i=1;i<=5;i++)
						{  
							for(int j=1;j<=i;j++)
							{
								System.out.print(" ");
							}
						
							for(int j=5;j>=i;j--)
							{
								k++;
								System.out.print(k);
							}
							
							System.out.println();
							
						}			
		
	}

}


