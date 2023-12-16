package com.a1612;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FormEx 
{
	JFrame frame;
	JLabel lmain,luname,lpass;
	JTextField tfuname;
	JPasswordField tfpass;
	JButton btnlogin;
	
	
	
	public FormEx() 
	{
		
		frame = new JFrame();
		
		lmain = new JLabel("Login");
		lmain.setBounds(120, 11, 146, 14);
		
		luname = new JLabel("Username");
		luname.setBounds(51, 53, 90, 14);
		
		lpass =new JLabel("Password");
		lpass.setBounds(51, 99, 90, 14);
		
		tfuname =new JTextField();
		tfuname.setBounds(130, 53, 86, 20);
		
		tfpass =new JPasswordField();
		tfpass.setBounds(130, 99, 86, 20);
		
		btnlogin =new JButton("Login");
		btnlogin.setBounds(100, 147, 89, 23);
		
		
		frame.add(lmain);
		frame.add(luname);
		frame.add(lpass);
		frame.add(tfuname);
		frame.add(tfpass);
		frame.add(btnlogin);
		frame.setSize(500,400);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new FormEx();
	}
}
