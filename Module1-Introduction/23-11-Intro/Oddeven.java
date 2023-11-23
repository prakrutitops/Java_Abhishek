package com.a2311;

import java.util.Scanner;

public class Oddeven 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);//scanner object
		
		System.out.println("Enter Your Number");//printf
		int num1 = sc.nextInt();//scanf
		
		
		System.out.println("Enter Your Number 2");//printf
		int num2 = sc.nextInt();//scanf
		
		
		int num3 = num1+num2;
		
		System.out.println(num3);
		
		if(num3%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
		
		
		
	}
}
