package com.multithreading.practice;

class Table1
{
	synchronized static void printTable(int n)
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



class MyThread41 extends Thread
{
	
	public void run()
	{
		Table1.printTable(5);
		
	}
}


class MyThread51 extends Thread
{
	
	public void run()
	{
		Table1.printTable(100);
		
	}
}



public class StaticSynchronization {

	public static void main(String[] args) {
		
		MyThread41 t1 = new MyThread41();
		t1.start();
		
		MyThread51 t2 = new MyThread51();
		t2.start();
	}

}
