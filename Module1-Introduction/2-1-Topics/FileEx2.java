package com.a21;

import java.io.*;
import java.util.*;

public class FileEx2 
{
	public static void main(String[] args) throws IOException 
	{
		
		FileOutputStream fout = new FileOutputStream("E://abhishek.txt");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = sc.next();
		
		fout.write(name.getBytes());
		
		fout.close();
		
		FileInputStream fis = new FileInputStream("E://abhishek.txt");
		
		int i=0;
		
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		
	}
}
