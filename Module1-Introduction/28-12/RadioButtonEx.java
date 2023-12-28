import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx 
{	
	JFrame frame;
	JRadioButton rb1,rb2;
	
	public RadioButtonEx() 
	{
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		
		rb1 = new JRadioButton("Male");
		rb2 = new JRadioButton("Female");
	
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		
		frame.add(rb1);
		frame.add(rb2);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new RadioButtonEx();
	}
}
