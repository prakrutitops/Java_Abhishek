package com.a712;

class P
{
	void p()
	{
		System.out.println("P Called");
	}
}
class Q extends P
{
	void q()
	{
		System.out.println("Q Called");
	}
}
class R extends Q
{
	void r()
	{
		System.out.println("R Called");
	}
}

public class MultiLevelEx 
{
	public static void main(String[] args) 
	{
		R r1 = new R();
		
		r1.p();
		r1.q();
		r1.r();
	}
}
