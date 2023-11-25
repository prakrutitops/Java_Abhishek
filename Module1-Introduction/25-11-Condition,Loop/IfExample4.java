package com.a2511;

import java.util.Scanner;

public class IfExample4 
{
	
	
	public static void main(String[] args) 
	{
		
		String myname ="tops";
		String mypass="1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Username");
		String uname = sc.next();
		
		System.out.println("Enter Your Password");
		String pass = sc.next();
	
		
		if(!uname.equals("tops"))
		{
			System.out.println("Your username is wrong");
		}
		if(!pass.equals("1234"))
		{
			System.out.println("Your password is wrong");
		}
		else
		{
			System.out.println("Logged in succesfully");
		}
	}
}
