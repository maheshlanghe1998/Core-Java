package assignment.day13.rational;

public class Gcd {

	
	
	static int gcd(int a, int b) // 12,8
	{
        if (b == 0)
            return a;
        else
            return gcd(b, a % b); 
                      //8,12%8=4 
                      //8,4 -->>a,b
                      //4,8%4=0
                      //4,0-->> b becomes 0 so, gcd is 4.
	}
	
	static int gcf(int x, int y)
	{
		while((x%y)>0)
		{
			int temp=x%y;
			 x=y;
			 y=temp;
		}
		return y;
		
	}
	
	public static void main(String[] args) {
		//System.out.println(gcd(12, 8));
		System.out.println(gcf(12, 8));
	}

}
