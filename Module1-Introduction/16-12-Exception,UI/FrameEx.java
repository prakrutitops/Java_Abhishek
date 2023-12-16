package com.a1612;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameEx 
{
	
	JFrame frame;
	JButton btn;
	
	
	public FrameEx() 
	{
			frame = new JFrame();
			
			btn = new JButton("Submit");
			btn.setBounds(200, 50, 100, 50);
			
			frame.add(btn);
			
			
			frame.setSize(1000,1000);
			frame.setLayout(null);
			frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new FrameEx();
	}
}
