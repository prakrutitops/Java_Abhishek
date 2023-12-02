package com.a212;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Student 
{
	
	static int id;
	static String name;
	
	public static void main(String[] args) 
	{
		
		//classname objname = new classname();
		
		
		Scanner sc = new Scanner(System.in);
		
		Student s1 = new Student();
		
		System.out.println("Enter Your id");
		id = sc.nextInt();
		System.out.println("Enter Your Name");
		name = sc.next();
		
		s1.id = id;
		s1.name = name;
		
		System.out.println(" \n Your id is : "+s1.id+" \n Your Name is : "+s1.name);
	}
}
