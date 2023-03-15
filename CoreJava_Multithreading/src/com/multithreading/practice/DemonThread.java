package com.multithreading.practice;

class Multithreading1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Daemon stmt");
			
			try {
				Thread.sleep(1000);
				
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
}

public class DemonThread {

	public static void main(String[] args) {
		
		Multithreading1 t1  = new Multithreading1 ();
		t1.setDaemon(true);
		t1.start();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main Thread");
			
			try {
				Thread.sleep(1000);
				
			}
			catch(InterruptedException e)
			{
				
			}
		}
		
	}

}
