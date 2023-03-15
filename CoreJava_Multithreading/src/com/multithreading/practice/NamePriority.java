package com.multithreading.practice;

class Mythread extends Thread
{
	public void run()
	{
		System.out.println("hi user");
	}
}

public class NamePriority {

	public static void main(String[] args) {
		
		Mythread t1 = new Mythread();
		t1.start();
		Mythread t2 = new Mythread();
		t2.start();
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		t1.setName("mahesh");
		
		System.out.println(t1.getName());
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Langhe");
		System.out.println(Thread.currentThread().getName());
		System.out.println(t1.getId());
		System.out.println(t2.getId());
		System.out.println(t1.isAlive());
	}

}
