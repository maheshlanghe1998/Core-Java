package com.innerclass;

public class AnonymousPredifinedInterface {

	public static void main(String[] args) {
		
		Runnable r1 = new Runnable()
				{

					@Override
					public void run() {
						System.out.println("First thread");
					}
			
				};
				
				
				Runnable r2 = new Runnable()
				{

					@Override
					public void run() {
						System.out.println("Second thread");
					}
			
				};
				
				
				Thread t1 = new Thread(r1);
				t1.start();
				
				Thread t2 = new Thread(r2);
				t2.start();
				

	}

}
