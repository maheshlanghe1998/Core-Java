package com.innerclass;

public class AnonymousThread {

	Thread t = new Thread() {
		
		public void run()
		{
			System.out.println("Run Implementations");
			
			System.out.println(t.getClass().getName());
		}
		
	};
	
	
	
	public static void main(String[] args) {
	
		
		AnonymousThread tt = new AnonymousThread();
		tt.t.start();

	}

}
