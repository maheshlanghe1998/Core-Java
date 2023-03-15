package exceptionhandling.unchecked.practice;

public class StringIndexOutOfBound {

	public static void main(String[] args) {
		try
		{
		String s = "Mahesh";
		
		System.out.println(s.charAt(10));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());
		}
		
	}

}
