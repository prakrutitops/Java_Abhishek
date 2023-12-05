package com.a512;

//parent
class MyColor
{
	String color ="black";
}

//child
class MyColor2 extends MyColor
{
	String color ="white";
	
	public void display()
	{
		System.out.println(super.color);
		System.out.println(color);
		//will call parent class variable value
	}
}

public class SuperEx 
{
	public static void main(String[] args) 
	{
		MyColor2 m2 = new MyColor2();
		m2.display();
	}
}
