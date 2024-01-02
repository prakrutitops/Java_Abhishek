package com.a21;

import java.io.*;

public class FileReadeRwRITER 
{
	
	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw = new FileWriter("E://abhishek.txt");
		String s = "Hello , this is my data";
		String s2 = "Hello , this is my data";
		fw.write(s);
		fw.write(s2);
		
		fw.close();
		
		FileReader fr = new FileReader("E://abhishek.txt");
		int i=0;
	
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
		
	}
	
}
