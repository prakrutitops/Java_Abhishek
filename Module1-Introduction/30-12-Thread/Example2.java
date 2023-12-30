package com.a3012;

class C implements Runnable
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thead C: "+i);
		}
	}
	
}
class D implements Runnable
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thead D: "+i);
		}
	}
	
}

public class Example2 
{
	public static void main(String[] args) {
		
		Thread t = new Thread(new C());
		Thread t2 = new Thread(new D());
		
		t.start();
		t2.start();
		
	}
}
