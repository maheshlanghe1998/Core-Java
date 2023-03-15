package exceptionhandling.unchecked.practice;

public class Posibility3 {

	public static void main(String[] args) {
		try
		{
			String str ="mahesh";
			System.out.println(str.charAt(8));
		}
		catch(NullPointerException ne)
		{
			ne.printStackTrace();
		}
		catch(IndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	}

}
