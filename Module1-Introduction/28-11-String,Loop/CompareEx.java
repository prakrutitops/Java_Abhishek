package com.a2811;

public class CompareEx 
{
	public static void main(String[] args) 
	{
		
		String name = "abhishek";
		String name2 = "abhishek2";
		String name3= "sachin";
		String name4="ABHISHEK";
		
		//equality1
		System.out.println(name==name2);
		System.out.println(name==name3);
		
		
		System.out.println("------------------");
		
		//equality2
		
		System.out.println(name.equals(name2));
		System.out.println(name.equals(name3));
		
		System.out.println("------------------");
		
		//equality3
		
		System.out.println(name.compareTo(name2));
		System.out.println(name.compareTo(name3));
		
		System.out.println("------------------");
		
		
		//equality4
		
		System.out.println(name.equals(name4));
		System.out.println(name.equalsIgnoreCase(name4));
		
	}
}
