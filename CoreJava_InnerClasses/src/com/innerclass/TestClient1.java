package com.innerclass;

class Test
{
	void m1()
	{
		
	}
	
	void m2()
	{
		
	}
}

class Test1 extends Test
{
	void m1()
	{
		System.out.println("m1");
	}
	
	void m2()
	{
		System.out.println("m2");
	}
}

public class TestClient1 {

	public static void main(String[] args) {
		
       Test1 t = new Test1();
       t.m1();
       t.m2();
       
	}

}
