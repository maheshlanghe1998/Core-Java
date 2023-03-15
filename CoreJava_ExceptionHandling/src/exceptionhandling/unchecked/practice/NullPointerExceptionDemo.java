package exceptionhandling.unchecked.practice;

public class NullPointerExceptionDemo {

	public static void main(String[] args)
	{
		
		try
		{
			String s = null;
			
			System.out.println(s.length());
		}
		catch(NullPointerException npe)
		{
			//System.out.println("Cannot invoke String.length() because 's' is null");
			
			npe.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Expection handled");
	}

}
