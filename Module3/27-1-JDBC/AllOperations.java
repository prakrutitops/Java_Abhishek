import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AllOperations 
{
	JFrame insertframe,deleteframe,updateframe;
	JTextField tfname,tfsurname,tfid;
	JButton insert,delete,edit,update;
	JPanel jp,jp2;
	
	public void insertdata()
	{
		insertframe = new JFrame();
		
		tfname = new JTextField(20);
		tfsurname = new JTextField(20);
		insert = new JButton("Insert");
		
		insert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				
				String name = tfname.getText().toString();
				String surname = tfsurname.getText().toString();
				
				try 
				{
					//db connectivity
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
					
					//query
					String sql ="insert into info(name,surname) values ('"+name+"','"+surname+"')";
					
					//statement
					Statement stmt = con.createStatement();
					
					//run the query using statement
					int status = stmt.executeUpdate(sql);
					
					if(status > 0)
					{
						System.out.println("Success");
						insertframe.setVisible(false);
					}
					else
					{
						System.out.println("fail");
					}
					
				}
				catch (Exception e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
			}
		});
		
		
		insertframe.add(tfname);
		insertframe.add(tfsurname);
		insertframe.add(insert);
		insertframe.setSize(500,500);
		insertframe.setLayout(new FlowLayout());
		insertframe.setVisible(true);
	}
	
	public void viewdata()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
		
			String sql ="select * from info";
			
			Statement stmt= con.createStatement();
			ResultSet set =stmt.executeQuery(sql);
			
			System.out.println("\t ID \t NAME \t SURNAME");
			
			while(set.next())
			{
				
				int id = set.getInt(1);
				String name = set.getString(2);
				String surname = set.getString(3);
				
				
				System.out.println("\t"+id+" \t "+name+" \t "+surname);
				
			}
			
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void deletedata()
	{
		
		deleteframe = new JFrame();
		tfid = new JTextField(20);
		delete = new JButton("Delete");
		
		delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				try 
				{
					String id =tfid.getText().toString();
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
					String sql ="delete from info where id='"+id+"'";
					
					Statement stmt = con.createStatement();
					
					int status = stmt.executeUpdate(sql);
					
					if(status>0)
					{
						deleteframe.setVisible(false);
					}
					else
					{
						System.out.println("fail");
					}
					
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
				
				
			}
		});
		
		deleteframe.add(tfid);
		deleteframe.add(delete);
		
		deleteframe.setSize(500,500);
		deleteframe.setLayout(new FlowLayout());
		deleteframe.setVisible(true);
		
	}
	
	public void updatedata()
	{
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
			
			updateframe = new JFrame();
			
			tfid = new JTextField(20);
			edit = new JButton("Edit");
			
			tfname = new JTextField(20);
			tfsurname = new JTextField(20);
			update = new JButton("Update");
		
			jp = new JPanel();
			jp2 = new JPanel();
			
			jp.add(tfid);
			jp.add(edit);
			
			jp2.add(tfname);
			jp2.add(tfsurname);
			jp2.add(update);
			jp.setVisible(true);
			jp2.setVisible(false);
			
			
			
			
			
			edit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
			
					String id = tfid.getText().toString();
					
					
					try 
					{
						Class.forName("com.mysql.jdbc.Driver");
						
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
						String sql ="select * from info where id='"+id+"'";
						
						Statement stmt = con.createStatement();
						
						ResultSet set= stmt.executeQuery(sql);
						
						if(set.next())
						{
							int id1 = set.getInt(1);
							String name = set.getString(2);
							String surname = set.getString(3);
							
							tfname.setText(name);
							tfsurname.setText(surname);
							
							
							update.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent e) {
									// TODO Auto-generated method stub
								
									String name = tfname.getText().toString();
									String surname = tfsurname.getText().toString();
									
									try 
									{
										//db connectivity
										Class.forName("com.mysql.jdbc.Driver");
										Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
										
										//query
										String sql ="update info set name='"+name+"',surname='"+surname+"' where id='"+id+"'";
										
										//statement
										Statement stmt = con.createStatement();
										
										//run the query using statement
										int status = stmt.executeUpdate(sql);
										
										if(status > 0)
										{
											System.out.println("Success");
											updateframe.setVisible(false);
										}
										else
										{
											System.out.println("fail");
										}
										
									}
									catch (Exception e1)
									{
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
											
									
									
									
									
									
								}
							});
						}
						
					
					} 
					catch (Exception e2) 
					{
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					
					
					
					
					jp.setVisible(false);
					jp2.setVisible(true);
				}
			});
			
			
			
			updateframe.add(jp);
			updateframe.add(jp2);
			updateframe.setSize(500,500);
			updateframe.setLayout(new FlowLayout());
			updateframe.setVisible(true);
			
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
