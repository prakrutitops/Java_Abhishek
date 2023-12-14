package com.a1412;

public class ArithmeticEx 
{
	public static void main(String[] args) 
	{
		
		try
		{
			//logic
			
			int data = 10/0;
			System.out.println(data);
		}
		catch(ArithmeticException error)
		{
			System.out.println(error);
		}
		System.out.println("Success");
		
	}
}
