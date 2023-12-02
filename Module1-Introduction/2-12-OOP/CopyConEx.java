package com.a212;

public class CopyConEx 
{
	
	int id;
	String name;
	
	CopyConEx(int i,String n)
	{
		id = i;
		name = n;
	}
	
	CopyConEx(CopyConEx c) 
	{
		// TODO Auto-generated constructor stub
		
		id = c.id;
		name = c.name;
	}
	
	void display()
	{
		
		System.out.println(id+" " +name);
	}
	
	public static void main(String[] args)
	{
		
		CopyConEx c1 = new CopyConEx(101, "abcd");
		CopyConEx c2 = new CopyConEx(c1);
		
		c1.display();
		c2.display();
	}
}
