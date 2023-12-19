package com.a1912;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CalculatorEx implements ActionListener
{
	JFrame frame;
	JTextField tf1,tf2,tf3;
	JButton btn1,btn2;
	
	public CalculatorEx() 
	{
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		
		tf1 = new JTextField();
		tf1.setBounds(176, 10, 86, 20);
		
		tf2 = new JTextField();
		tf2.setBounds(176, 50, 86, 20);
		
		tf3 = new JTextField();
		tf3.setBounds(176, 90, 86, 20);
		tf3.setEditable(false);
		btn1 = new JButton("+");
		btn1.setBounds(156, 136, 60, 23);
		
		btn2 = new JButton("-");
		btn2.setBounds(236, 136, 51, 23);
		
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		frame.add(btn1);
		frame.add(btn2);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}
	
	public static void main(String[] args) 
	{
		new CalculatorEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
	
		String a = tf1.getText().toString();
		String b = tf2.getText().toString();
		int c = 0;
		
		if(e.getSource()==btn1)
		{
			c = Integer.parseInt(a)+Integer.parseInt(b);
		}
		if(e.getSource()==btn2)
		{
			c = Integer.parseInt(a)-Integer.parseInt(b);
		}
		
		tf3.setText(String.valueOf(c));
	}
}
