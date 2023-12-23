package com.a2312;

import javax.swing.JFrame;

import com.toedter.calendar.JDateChooser;

public class DatepickerEx 
{
	JFrame jf;
	JDateChooser dateChoose;
	 
	public DatepickerEx() 
	{
		jf = new JFrame();
		
		dateChoose = new JDateChooser();
		dateChoose.setBounds(115, 246, 137, 20);
		
		jf.add(dateChoose);
		
		jf.setSize(500,500);
		jf.setLayout(null);
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new DatepickerEx();
	}
}
