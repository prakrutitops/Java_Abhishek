import java.awt.Image;
import javax.swing.*;

public class test1 
{
	JFrame FoodMenu;
	JLabel l1,l2,l3;
	JCheckBox chk1,chk2,chk3;
		
	public test1() 
	{
		
		FoodMenu = new JFrame("New Asian Restaurant Ordering System");
		//FoodMenu.setBounds(700, 700, 1500, 1500);
		
		
		
			
		//Food: Sweet Sour Pork 
		l1 = new JLabel();
		int widthSSP=68,heightSSP=51;
		ImageIcon imageSSP = new ImageIcon("src/FoodList/SweetSourPork.jpg");
		imageSSP.setImage(imageSSP.getImage().getScaledInstance(widthSSP,heightSSP,Image.SCALE_DEFAULT));
	    l1.setIcon(imageSSP);
		l1.setSize(widthSSP,heightSSP);
		l1.setBounds(46, 80, 81, 50);
		chk1 = new JCheckBox("Pizza @ Rs. 100");
		chk1.setBounds(130, 80, 180, 50);
		FoodMenu.getContentPane().add(l1);
		FoodMenu.getContentPane().add(chk1);
		
		
		
		
		
		
		l2 = new JLabel();
		
		ImageIcon imageSSP2 = new ImageIcon("src/FoodList/SweetSourPork.jpg");
		imageSSP.setImage(imageSSP2.getImage().getScaledInstance(widthSSP,heightSSP,Image.SCALE_DEFAULT));
	    l2.setIcon(imageSSP2);
		l2.setSize(widthSSP,heightSSP);
		l2.setBounds(46, 160, 81, 50);
		chk2 = new JCheckBox("Burger @ Rs. 50");
		chk2.setBounds(130, 160, 180, 50);
		FoodMenu.getContentPane().add(l2);
		FoodMenu.getContentPane().add(chk2);
		
		
		l3 = new JLabel("");
		
		ImageIcon imageSSP3 = new ImageIcon("src/FoodList/SweetSourPork.jpg");
		imageSSP.setImage(imageSSP3.getImage().getScaledInstance(widthSSP,heightSSP,Image.SCALE_DEFAULT));
	    l3.setIcon(imageSSP3);
		l3.setSize(widthSSP,heightSSP);
		l3.setBounds(46, 240, 81, 50);
		FoodMenu.getContentPane().add(l3);
		
		FoodMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FoodMenu.getContentPane().setLayout(null);
		FoodMenu.setSize(500,500);
		FoodMenu.setVisible(true);
		
	}
		
	public static void main(String[] args) {
		
		
		new test1();
	}
	
}
