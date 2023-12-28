import javax.swing.*;

public class TablEx 
{
	JFrame frame;
	JTable jt;
	String data[][]={ 
			{"101","Amit","670000"},    
            {"102","Jai","780000"},    
            {"103","Sachin","700000"}};    
	String column[]={"ID","NAME","SALARY"};
	 
	public TablEx() 
	{
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		
		jt = new JTable(data,column);
		jt.setBounds(30,40,200,300);    
		
		JScrollPane sp=new JScrollPane(jt);         
		
		frame.add(sp);          
		frame.setSize(300,400);    
		frame.setVisible(true);    
	}
	public static void main(String[] args) 
	{
		new TablEx();
	}
}
