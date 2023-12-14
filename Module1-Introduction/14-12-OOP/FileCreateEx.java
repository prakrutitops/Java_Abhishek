package com.a1412;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCreateEx 
{
	public static void main(String[] args) 
	{
		
		try 
		{
			String a ="Welcome to tops";
			FileOutputStream fout = new FileOutputStream("E://abhishek.txt");
			fout.write(a.getBytes());
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			 // e.printStackTrace();
			System.out.println(e);
		} 
		System.out.println("Success");
		
		
	}
}
