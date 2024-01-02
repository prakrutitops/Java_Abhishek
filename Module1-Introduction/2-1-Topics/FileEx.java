package com.a21;

import java.io.*;
import java.util.*;

public class FileEx 
{
	public static void main(String[] args) throws IOException 
	{
		
		
		
		FileInputStream fis = new FileInputStream("E://sha-1.txt");
		
		int i=0;
		
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		
	}
}
