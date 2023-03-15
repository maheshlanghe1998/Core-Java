package com.innerclass;

class Outer7 
{
	static int a=10,b=20;
	int k = 90;
	
	
	static class Inner7
	{
		int c= 30;
		void m1()
		{
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
			Outer7 o = new Outer7();
			
			System.out.println(o.k);
		}
	}
}


public class StaticInner {

	public static void main(String[] args) {
		
		Outer7.Inner7 i  = new Outer7.Inner7();
		i.m1();
		
		
	}

}
