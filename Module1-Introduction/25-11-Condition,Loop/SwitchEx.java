package com.a2511;

import java.util.Scanner;

public class SwitchEx 
{
	public static void main(String[] args) 
	{
		System.out.println("\n Enter 1 For English \n Enter 2 For Hindi \n Enter 3 For Gujarati");
		
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		
		switch(num)
		{
		
			case 1: System.out.println("Your Selected Language is English");
			break;
			
			case 2: System.out.println("Your Selected Language is Hindi");
			break;
			
			case 3: System.out.println("Your Selected Language is Gujarati");
			break;
			
			default:System.out.println("Please Enter Correct Number");
		}
	}
}
