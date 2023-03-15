package com.multithreading.practice;

class Mythread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("this is thread one"+i);
		}
	}
}

class Mythread2 extends Thread
{
	public void run()
	{
		for(int i=10;i>=0;i--)
		{
			System.out.println("this is thread two"+i);
		}
	}
}



public class TwoThread {

	public static void main(String[] args) {
		
		Mythread1 t1=new Mythread1();
		Mythread2 t2=new Mythread2();
		t1.start();
		t2.start();
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("main thread");
		}

	}

}
