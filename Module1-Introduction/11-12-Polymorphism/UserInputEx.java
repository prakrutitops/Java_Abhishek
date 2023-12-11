package com.a1112;

import java.util.Scanner;

public class UserInputEx 
{
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Id");
		int id = sc.nextInt();
		
		System.out.println("Enter Your Name");
		String name = sc.next();
	
		System.out.println(id+" "+name);
	
	}
}
