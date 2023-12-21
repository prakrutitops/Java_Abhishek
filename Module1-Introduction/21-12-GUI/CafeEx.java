package com.a2112;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CafeEx extends WindowAdapter
{
	JFrame frame;
	JCheckBox chk1,chk2,chk3;
	JButton btnsubmit;
	
	public CafeEx() 
	{
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		
		chk1 = new JCheckBox("Pizza @ Rs.100");
		chk1.setBounds(37, 20, 197, 23);
		
		chk2 = new JCheckBox("Burger @ Rs.70");
		chk2.setBounds(37, 60, 197, 23);
		
		chk3 = new JCheckBox("Coffee @ Rs.120");
		chk3.setBounds(37, 100, 197, 23);
		
		btnsubmit = new JButton("Order");
		btnsubmit.setBounds(37, 150, 97, 23);
		
		btnsubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int amount = 0;
				StringBuffer buffer = new StringBuffer("\n Selected Items: ");
				
				if(chk1.isSelected())
				{
					amount+=100;
					buffer.append("\n Pizza @ Rs. 100");
				}
				if(chk2.isSelected())
				{
					amount+=70;
					buffer.append("\n Burger @ Rs. 70");
				}
				if(chk3.isSelected())
				{
					amount+=120;
					buffer.append("\n Coffee @ Rs. 120");
				}
				
				buffer.append("\n Total :"+amount);
				
				//System.out.println(buffer.toString());
				JOptionPane.showMessageDialog(frame,buffer.toString());
				
			}
		});
		frame.addWindowListener(this);
		frame.add(chk1);
		frame.add(chk2);
		frame.add(chk3);
		frame.add(btnsubmit);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	public static void main(String[] args)
	{
		new CafeEx();
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
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
