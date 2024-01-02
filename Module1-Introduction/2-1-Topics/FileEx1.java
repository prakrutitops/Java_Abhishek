package com.a21;

import java.io.File;
import java.io.IOException;

public class FileEx1 {
	
	public void getFileDetails(File file) {
		
	System.out.println(file.exists());;
	System.out.println(file.isDirectory());;
	//System.out.println(file.lastModified());;
	System.out.println(file.getName());;
	System.out.println(file.getAbsolutePath());;
	System.out.println(file.getPath());;
	System.out.println(file.canExecute());;
	System.out.println(file.canRead());;
	
	}
	
	public static void main(String[] args) throws Exception {
		
		FileEx1 fcd = new FileEx1();
		
		File file = new File("E://MyFile.txt");
		file.createNewFile();
		
		fcd.getFileDetails(file);
		
	}
}