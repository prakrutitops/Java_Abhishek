package com.a21;

abstract class A
{
	void a()
	{
		System.out.println("a");
	}
	
	abstract void b();
}
class B extends A
{

	@Override
	void b() 
	{
		// TODO Auto-generated method stub
		System.out.println("b");
	}
	
}


public class AbstractEx1 
{
	
	public static void main(String[] args)
	{
		//A a1 = new A();
		
		B b = new B();
		
		b.a();
		b.b();
		
	}
}
