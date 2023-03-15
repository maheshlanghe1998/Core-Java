package com.innerclass;

class Outer4
{
	int a=100;
	class Inner4
	{
		int a = 200;
		void m1(int a)
		{
			System.out.println("Local variable: "+a);
			System.out.println("Instance variable: "+this.a);
			System.out.println("Outer Class Instance variable: "+Outer4.this.a);
			
		}
	}
}


public class OuterThis {

	public static void main(String[] args) {
		
		Outer4  o = new Outer4();
		Outer4.Inner4 i = o.new Inner4();
		i.m1(300);
		
	}

}
