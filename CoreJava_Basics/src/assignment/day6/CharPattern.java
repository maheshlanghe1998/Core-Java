package assignment.day6;

public class CharPattern {

	public static void main(String[] args) {
		
		//pattern 1:
		
		for(int i=64;i<=68;i++)   
		{
			for(int j=64;j<=i;j++)
			{
				System.out.print((char)(i+1)+" ");
			}
			System.out.println();
		}
		
		//pattern 2:
		        System.out.println("\n");
				for(int i=64;i<=68;i++)
				{
					for(int j=64;j<=i;j++)
					{
						System.out.print((char)(j+1)+" ");
					}
					System.out.println();
				}
      
				
				//pattern 3:
		        System.out.println("\n");
		        int A=64;
				for(int i=1;i<=5;i++)
				{
					for(int j=1;j<=i;j++)
					{
						A++;
						System.out.print((char)(A)+" ");
					}
					System.out.println();
				}
      
				
				//pattern 4:
				System.out.println("\n");
				
				for(int i=64;i<=68;i++)
				{
					for(int j=68;j>=i;j--)
					{
						System.out.print((char)(i+1)+" ");
					}
					System.out.println();
				}
		
				//pattern 5:
				System.out.println("\n");
				
				for(int i=64;i<=68;i++)
				{
					for(int j=68;j>=i;j--)
					{
						System.out.print((char)(j+1)+" ");
					}
					System.out.println();
				}
				
				//pattern 5:
				System.out.println("\n");
				
				for(int i=64;i<=68;i++)
				{
					for(int j=68;j>=i;j--)
					{
						System.out.print(" ");
					}
					
					for(int k=64;k<=i;k++)
					{
						System.out.print((char)(i+1));
					}
					System.out.println();
				}
		        
				
				//pattern 6:
				System.out.println("\n");
				
				for(int i=64;i<=68;i++)
				{
					for(int j=64;j<=i;j++)
					{
						System.out.print(" ");
					}
					
					for(int k=68;k>=i;k--)
					{
						System.out.print((char)(i+1));
					}
					System.out.println();
				}
				

	}

}
