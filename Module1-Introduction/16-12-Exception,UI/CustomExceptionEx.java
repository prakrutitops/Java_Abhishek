package com.a1612;

import java.util.Scanner;

public class CustomExceptionEx 
{
	public static void main(String[] args) {
		
		
		CustomExceptionEx c1 = new CustomExceptionEx();

		CheckingAccount c2 = new CheckingAccount(101);
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Your Deposite Amount");
		double amount = sc.nextDouble(); 
		
		c2.deposite(amount);
		
		try 
		{
			System.out.println("Please Enter Your Withdraw Amount");
			double withdraw = sc.nextDouble(); 
			c2.withdral(withdraw);
			System.out.println("Your balance is = "+c2.getBalance());
		}
		catch (InsufficintFundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("You have no sufficient balance, You need more  "+e.getAmount());
			System.out.println("Your balance is = "+c2.getBalance());
		}
	}
}
