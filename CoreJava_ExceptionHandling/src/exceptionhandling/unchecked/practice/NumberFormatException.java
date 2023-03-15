package exceptionhandling.unchecked.practice;

public class NumberFormatException {

	public static void main(String[] args) {
		
		
		try {
			
		
		String s ="Mahi";
		int i =Integer.parseInt(s);
		
		System.out.println(i);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
