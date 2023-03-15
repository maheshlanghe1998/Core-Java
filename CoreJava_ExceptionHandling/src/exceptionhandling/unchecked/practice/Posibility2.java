package exceptionhandling.unchecked.practice;

public class Posibility2 {

	public static void main(String[] args) {
		try
		{
			int a=10, b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.toString());
		}
		try
		{
			String str ="mahesh";
			System.out.println(str.charAt(8));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}

	}

}
