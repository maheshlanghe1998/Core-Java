package com.multithreading.practice;

class Multithreading3 implements Runnable
{

	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("User Thread");
		}
		
	}
	
}
public class RunnableThread {

	public static void main(String[] args) {
		
		Multithreading3 r= new Multithreading3();
		
		Thread t = new Thread(r);
		
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
		
	}

}
