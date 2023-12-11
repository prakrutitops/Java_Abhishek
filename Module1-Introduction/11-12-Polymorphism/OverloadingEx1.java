package com.a1112;

public class OverloadingEx1 
{
	static int add(int a,int b)
	{
		return a+b;
	}
	
	static double add(double a,double b)
	{
		return a+b;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(OverloadingEx1.add(6,5));
		System.out.println(OverloadingEx1.add(6.0,5.0));
	}
}
