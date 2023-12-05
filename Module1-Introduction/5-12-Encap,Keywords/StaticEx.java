package com.a512;


/*
 	Static:
 	 1)Variable
 	 2)Method
 	 3)Block
 	 	
 */

public class StaticEx 
{
	
	static int counter = 0;
	
	public StaticEx() 
	{
		// TODO Auto-generated constructor stub
		
		counter++;
		System.out.println(counter);
		
	}
	
	
	public static void main(String[] args) 
	{
		
		StaticEx s1 = new StaticEx();
		StaticEx s2 = new StaticEx();
		StaticEx s3 = new StaticEx();
		
	}
}
