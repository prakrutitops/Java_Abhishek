package com.a2312;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DropDownEx 
{
	
	JFrame frame;
	String city[]= {"Rajkot","Ahmedabad","Baroda","Surat"};
	JLabel label,label2;
	JComboBox cb;
	JButton btn;
	JPanel jp;
	
	public DropDownEx() 
	{
		
		frame = new JFrame();
		
		cb = new JComboBox<>(city);
		cb.setBounds(88, 11, 130, 22);
		
		btn = new JButton("Submit");
		btn.setBounds(250, 11, 100, 22);
		
		label = new JLabel("");
		label.setBounds(10, 150, 298, 133);
		
		label2 = new JLabel("");
		label2.setBounds(88, 50, 200, 22);
		
		jp = new JPanel();
		jp.setBounds(10, 117, 298, 133);
		
		jp.setVisible(false);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				
				String name = "Your Selected City is: "+cb.getItemAt(cb.getSelectedIndex());
				
				label.setText(name);
				
				jp.setVisible(true);
				
				
				if(cb.getSelectedIndex()==0)
				{
					StringBuffer buffer = new StringBuffer();
					buffer.append("Ra");
					buffer.append("Rb");
					buffer.append("Rc");
					buffer.append("Rd");
					
					label2.setText("Your Near by Places are: "+buffer.toString());
				}
				if(cb.getSelectedIndex()==1)
				{
					StringBuffer buffer = new StringBuffer();
					buffer.append("Aa");
					buffer.append("Ab");
					buffer.append("Ac");
					buffer.append("Ad");
					
					label2.setText("Your Near by Places are: "+buffer.toString());
				}
				if(cb.getSelectedIndex()==2)
				{
					StringBuffer buffer = new StringBuffer();
					buffer.append("Ba");
					buffer.append("Nb");
					buffer.append("Bc");
					buffer.append("Bd");
					
					label2.setText("Your Near by Places are: "+buffer.toString());
				}
				if(cb.getSelectedIndex()==3)
				{
					StringBuffer buffer = new StringBuffer();
					buffer.append("Sa");
					buffer.append("Sb");
					buffer.append("Sc");
					buffer.append("Sd");
					
					label2.setText("Your Near by Places are: "+buffer.toString());
				}
				
				
				
			}
		});
		
		jp.add(label2);
		frame.add(jp);
		frame.add(label);
		frame.add(cb);
		frame.add(btn);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new DropDownEx();
	}
}
