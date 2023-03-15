package assignment.day6;

public class StarPattern {

	public static void main(String[] args) {
     //pattern 1: 
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//pattern 2:
		System.out.println("\n");
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//pattern 3:
				System.out.println("\n");
				for(int i=1;i<=5;i++)
				{
					for(int j=5;j>=i;j--)
					{
						System.out.print(" ");
					}
					
					for(int k=1;k<=i;k++)
					{
						System.out.print("*");
					}
					System.out.println();
				}
				
				//pattern 4:
				System.out.println("\n");
				for(int i=1;i<=5;i++)
				{
					for(int j=1;j<=i;j++)
					{
						System.out.print(" ");
					}
					
					for(int k=5;k>=i;k--)
					{
						System.out.print("*");
					}
					System.out.println();
				}
				
				
	}

}
