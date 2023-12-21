package com.a2112;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

//Multiple Selection - Checkbox

public class CheckboxEx implements ActionListener
{
	JFrame frame;
	JCheckBox chk1,chk2;
	
	public CheckboxEx() 
	{
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		
		chk1 = new JCheckBox("C++");
		chk1.setBounds(37, 19, 97, 23);
		
		chk2 = new JCheckBox("Java");
		chk2.setBounds(37, 39, 97, 23);
		
		chk1.addActionListener(this);
		chk2.addActionListener(this);
		
		frame.add(chk1);
		frame.add(chk2);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	
	}
	
	public static void main(String[] args) 
	{
		
		new CheckboxEx();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==chk1)
		{
			System.out.println("C++ Clicked");
		}
		if(e.getSource()==chk2)
		{
			System.out.println("Java Clicked");
		}
	}
}
