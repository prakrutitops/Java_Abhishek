import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test implements ActionListener
{
	JFrame frame;
	JButton btninsert,btnview,btnupdate,btndelete;
	
	public Test() 
	{
		frame = new JFrame();
		
		btninsert = new JButton("Insert");
		btnview = new JButton("View");
		btnupdate = new JButton("Update");
		btndelete = new JButton("Delete");
		btninsert.addActionListener(this);
		btnview.addActionListener(this);
		btnupdate.addActionListener(this);
		btndelete.addActionListener(this);
		frame.add(btninsert);
		frame.add(btnview);
		frame.add(btnupdate);
		frame.add(btndelete);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		 
		
	}
	public static void main(String[] args) 
	{
		new Test();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		AllOperations a = new AllOperations();
		
		if(e.getSource()==btninsert)
		{
			a.insertdata();
		}
		if(e.getSource()==btnview)
		{
			a.viewdata();
		}
		if(e.getSource()==btnupdate)
		{
			a.updatedata();
		}
		if(e.getSource()==btndelete)
		{
			a.deletedata();
		}
		
	}
}
