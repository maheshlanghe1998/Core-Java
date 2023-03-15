package com.multithreading.practice;

class  Multithreading2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" ");
		}
	}
}


public class JoinThread {

	public static void main(String[] args) throws InterruptedException {
		
		Multithreading2 t1 = new Multithreading2();
		Multithreading2 t2 = new Multithreading2();
		t1.start();
		t1.join(); // Because of  join method main tread has to wait until completion of thread t1.  
		
		t2.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
		
				
	}

}
