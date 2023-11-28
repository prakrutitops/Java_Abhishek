package com.a2811;

public class Stringfun 
{
	public static void main(String[] args) 
	{
		
		String name = "sachin";
		String name2="ABHISHEK";
		String name3=" lenovo  ";
		
		System.out.println(name.toUpperCase());
		System.out.println(name2.toLowerCase());
		System.out.println(name3.trim());
		
		System.out.println(name.charAt(0));
		
		String data = "php is a programming language.php is a open source.php is good language";
		
		System.out.println(data.replace("php","java"));
		System.out.println(name.replace("s","S"));
		
		System.out.println(name.startsWith("sa"));
		System.out.println(name.endsWith("nn"));
		
	}
}
