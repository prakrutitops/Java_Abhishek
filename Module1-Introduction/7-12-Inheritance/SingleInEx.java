package com.a712;

class A1
{
	void a1()
	{
		System.out.println("a1");
	}
}
class B1 extends A1
{
	void b1()
	{
		System.out.println("b1");
	}
}


public class SingleInEx 
{
	
	public static void main(String[] args) 
	{
		
		B1 b = new  B1();
		
		b.a1();
		b.b1();
		
	}
	
}
