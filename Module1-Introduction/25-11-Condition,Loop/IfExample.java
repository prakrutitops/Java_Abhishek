package com.a2511;

import java.util.Scanner;

public class IfExample 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age");
		int age = sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Eligible to vote");
			
			if(age>=60)
			{
				System.out.println("Your are Senior Citizen");
			}
			else
			{
				System.out.println("You are under young category");
			}
		}

		else
		{
			System.out.println("Not Eligible to vote");
		}
		
	}
}
