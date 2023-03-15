package assignment.day9;

public class CountCharacter 
{
    public static int countA(String s)
    {
    	int Count=0;
    	
    	for(int i=0;i<s.length();i++)
    	{
    		if(s.charAt(i)=='A')
    			Count++;
    	}
		return Count;
    }
	
	public static void main(String[] args) {
		
		System.out.println(countA("MAHARASHTRA"));
	}

}
