package com.a2112;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ConfirmationEx extends WindowAdapter
{
	JFrame frame;
	
	public ConfirmationEx() 
	{
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		frame.addWindowListener(this);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	
	}
	public static void main(String[] args) 
	{
		
		new ConfirmationEx();
	}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		
	int ans = JOptionPane.showConfirmDialog(frame,"Are you sure you want to exit?");
		
		if(ans==JOptionPane.YES_OPTION)
		{
			frame.setVisible(false);
		}
		if(ans==JOptionPane.NO_OPTION)
		{
			frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}
		if(ans==JOptionPane.CANCEL_OPTION)
		{
			frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}
		
		
	}
}
