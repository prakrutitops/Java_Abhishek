package com.a2312;

import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageDisplayEx 
{
	JFrame frame;
	JLabel l1;
	public ImageDisplayEx() 
	{
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		
		l1 = new JLabel("a");
		
		int widthSSP=68,heightSSP=51;
		ImageIcon imageSSP = new ImageIcon("D:\\photos\\a.jpg");
        imageSSP.setImage(imageSSP.getImage().getScaledInstance(widthSSP,heightSSP,Image.SCALE_DEFAULT));
        l1.setIcon(imageSSP);
		
        frame.add(l1);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new ImageDisplayEx();
	}
}
