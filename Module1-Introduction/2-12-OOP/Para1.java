package com.a212;

public class Para1 
{
	int id;
	String name;
	
	public Para1(int id,String name) 
	{
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.name = name;
		
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) 
	{
		
		Para1 p1 = new Para1(101,"Abcd");
		Para1 p2 = new Para1(102,"Pqrs");
		
		p1.display();
		p2.display();
		
		
	}
	
}
