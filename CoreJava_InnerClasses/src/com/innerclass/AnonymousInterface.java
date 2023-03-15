package com.innerclass;

interface IT1
{
	void m1();
	void m2();
	
}

public class AnonymousInterface {

	IT1 i  =new IT1()   // here internally implementation class will be generated and its object will created. 
			{

				@Override
				public void m1() {
					System.out.println(i.getClass().getName());
				}

				@Override
				public void m2() {
					System.out.println("m2 Method");
				}
		       
			};
	
	
	public static void main(String[] args) {
		
		AnonymousInterface t = new AnonymousInterface();
		
		t.i.m1();
		t.i.m2();
		

	}

}
