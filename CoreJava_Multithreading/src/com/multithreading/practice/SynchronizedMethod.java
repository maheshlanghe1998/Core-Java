package com.multithreading.practice;

class Table
{
	synchronized void printTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}

class MyThread4 extends Thread
{
	Table t;
	
	MyThread4(Table t)
	{
		this.t = t;	
	}
	
	public void run()
	{
		t.printTable(5);
		
	}
}



class MyThread5 extends Thread
{
	Table t;
	
	MyThread5(Table t)
	{
		this.t = t;	
	}
	
	public void run()
	{
		t.printTable(100);
		
	}
}

public class SynchronizedMethod {

	public static void main(String[] args) {
		
		Table obj = new Table();
		
		MyThread4 t1 = new MyThread4(obj);
		t1.start();
		
		
		MyThread5 t2 = new MyThread5(obj);
		t2.start();
	}

}
