package exceptionhandling.unchecked.practice;

public class Posibility6 {

	public static void main(String[] args) {
		try
		{	
			try
			{
			   int a=10;
			   int b=0;
			   System.out.println(a/b);
			}
			catch(ArithmeticException e1)
			{
				System.out.println("can't divided by zero");
			}
			
            int arr[] = {10,20,30,40};
			
			for(int i=1;i<=arr.length;i++)
			{
				System.out.println(arr[4]);
			}
			
		}
		catch(Exception e2)
		{	
			try
			{
				String s=null;
				System.out.println(s);
			}
			catch(Exception e3)
			{
				e3.printStackTrace();
			}
			
			System.out.println(e2.getMessage());
			
		}
		
	}

}
