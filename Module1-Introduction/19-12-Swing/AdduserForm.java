package com.a1912;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AdduserForm 
{
	JFrame frame;
	JLabel lfname,llname,lemail,lpass;
	JTextField tfname,tlname,temail;
	JPasswordField tpass;
	JButton btnadduser;
	
	public AdduserForm() 
	{
		
		frame = new JFrame();
		
		tfname = new JTextField();
		tfname.setBounds(176, 10, 120, 20);
		
		tlname = new JTextField();
		tlname.setBounds(176, 50, 120, 20);
		
		temail = new JTextField();
		temail.setBounds(176, 90, 120, 20);
		
		tpass = new JPasswordField();
		tpass.setBounds(176, 130, 120, 20);
		
		lfname = new JLabel("Enter Firstname");
		lfname.setBounds(50, 10, 120, 20);
		
		llname = new JLabel("Enter Lastname");
		llname.setBounds(50, 50, 120, 20);
		
		lemail = new JLabel("Enter Email");
		lemail.setBounds(50, 90, 120, 20);
		
		lpass = new JLabel("Enter Password");
		lpass.setBounds(50, 130, 120, 20);

		btnadduser = new JButton("Add User");
		btnadduser.setBounds(124, 179, 89, 23);
		
		btnadduser.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				
				String fname = tfname.getText().toString();
				String lname = tlname.getText().toString();
				String email= temail.getText().toString();
				String pass = tpass.getText().toString();
				
				String fname1 = "\n Your Firstname is :";
				String lname1 = "\n Your Lastname is :";
				String email1 = "\n Your Email is :";
				String pass1 = "\n Your Password is: ";
				
				
				try 
				{
					
					
					
					
					FileOutputStream fout = new FileOutputStream("E://abhishek.txt");
					fout.write(fname1.getBytes());
					fout.write(fname.getBytes());
					fout.write(lname1.getBytes());
					fout.write(lname.getBytes());
					fout.write(email1.getBytes());
					fout.write(email.getBytes());
					fout.write(pass1.getBytes());
					fout.write(pass.getBytes());
					System.out.println("success");
				} 
				catch (Exception e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		
		
		frame.add(tfname);
		frame.add(tlname);
		frame.add(temail);
		frame.add(tpass);
		frame.add(lfname);
		frame.add(llname);
		frame.add(lemail);
		frame.add(lpass);
		frame.add(btnadduser);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
}
