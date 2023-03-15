package com.multithreading.practice;

class Multithread extends Thread
{
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
	}
}

public class Priority {

	public static void main(String[] args) {
		
		Multithread t1 = new Multithread();
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();

		Multithread t2 = new Multithread();
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
	}

}
