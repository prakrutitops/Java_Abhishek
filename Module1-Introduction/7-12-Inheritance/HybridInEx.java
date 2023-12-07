package com.a712;

class J
{
	void j()
	{
		System.out.println("J");
	}
}
class K extends J
{
	void k()
	{
		System.out.println("K");
	}
}
interface L 
{
	void l();
}
class X extends K implements L
{

	@Override
	public void l() 
	{
		// TODO Auto-generated method stub
		System.out.println("L");
	}
	
	void x()
	{
		System.out.println("x");
	}
	
}

public class HybridInEx 
{
	public static void main(String[] args) 
	{
		X x1 =new X();
		
		x1.j();
		x1.k();
		x1.l();
		x1.x();
	}
}
