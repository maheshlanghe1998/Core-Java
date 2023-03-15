package exceptionhandling.unchecked.practice;

public class Posibility4 {

	public static void main(String[] args) 
	{
		try
		{
			String s =null;
			System.out.println(s);
			try
			{
				int a=10;
				int b=0;
				int c=a/b;
				System.out.println(c);
						
			}
			catch(ArithmeticException e)
			{
			   e.printStackTrace();
			   
			}
		}
		catch(NullPointerException z)
		
		{
			z.getStackTrace();
		}

	}

}
