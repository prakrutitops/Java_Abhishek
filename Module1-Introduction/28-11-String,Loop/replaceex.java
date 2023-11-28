package com.a2811;

public class replaceex 
{
	public static void main(String[] args) 
	{
		
		StringBuffer buffer = new StringBuffer("Hello");
		
		buffer.replace(1,3,"Java");
		System.out.println(buffer);
	}
}
