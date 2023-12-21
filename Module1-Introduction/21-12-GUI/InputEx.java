package com.a2112;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InputEx 
{
	JFrame frame;
	
	public InputEx() 
	{
		
		frame = new JFrame();
		
		String name = JOptionPane.showInputDialog(frame,"Enter Your Name");
		
		System.out.println("Welcome "+name);
	}
	public static void main(String[] args) 
	{
		new InputEx();
	}
}
