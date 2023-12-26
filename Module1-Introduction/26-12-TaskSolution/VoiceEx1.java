import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.*;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.*;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JDialog;

import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.sound.sampled.AudioInputStream;
import java.applet.AudioClip;


public class VoiceEx1 implements ActionListener 
{
    private JFrame Customer;
    private JTextField txtTypeName; 
    private JPasswordField passwordFiled;
    JButton btnLogin;
    private JDialog Dialog;
    String[] choics = { "win.wav","lost.wav" }; 
	URL file1 = getClass().getResource(choics[0]); 
	URL file2 = getClass().getResource(choics[1]); 
	String username,password;
	AudioClip soundWin = java.applet.Applet.newAudioClip(file1);
	AudioClip soundLost = java.applet.Applet.newAudioClip(file2);
	

	public void winVoice(){
		   soundWin.play();
	  }
	
	public void lostVoice(){
		   soundLost.play();
	  }
	
	
    public void setVisible(boolean visible) {
        if (Customer != null) {
        	Customer.setVisible(visible);
        }
    }
    


public VoiceEx1() 
{
	 Customer = new JFrame("Login Form");
	 
     
     JLabel lblWelcome = new JLabel("Welcome ");
     lblWelcome.setForeground(Color.ORANGE);
     lblWelcome.setBounds(108, 21, 229, 39);
     Customer.getContentPane().add(lblWelcome);

     JLabel lblUser = new JLabel("User Name");
     lblUser.setForeground(Color.BLUE);
     lblUser.setBounds(93, 72, 96, 29);
     Customer.getContentPane().add(lblUser);

     JLabel lblPassword = new JLabel("Password");
     lblPassword.setForeground(Color.BLUE);
     lblPassword.setBounds(93, 121, 96, 29);
     Customer.getContentPane().add(lblPassword);
     
     
     txtTypeName = new JTextField();
     txtTypeName.setText("Enter Name");
     txtTypeName.setBounds(227, 73, 130, 26);
     Customer.getContentPane().add(txtTypeName);
     txtTypeName.setColumns(10);

     passwordFiled = new JPasswordField();
     passwordFiled.setBounds(227, 122, 130, 26);
     Customer.getContentPane().add(passwordFiled);

     btnLogin = new JButton("Login");
     btnLogin.addActionListener(this);
     btnLogin.setBounds(72, 186, 117, 29);
     Customer.getContentPane().add(btnLogin);
     
  

     Customer.add(lblWelcome);
     Customer.add(lblUser);
     Customer.add(lblPassword);
     Customer.add(txtTypeName);
     Customer.add(passwordFiled);
     Customer.add(btnLogin);
     Customer.setSize(500,500);
     Customer.setLayout(null);
     Customer.setVisible(true);
}

   
    public void actionPerformed(ActionEvent e){
        
    	
        if(e.getSource()==btnLogin) 
        {
        	username = txtTypeName.getText().toString();
        	password = passwordFiled.getText().toString();
        	
        	if(username.equals("abhishek") && password.equals("1234")) 
        	{
        		winVoice();
        		JOptionPane.showMessageDialog(Dialog, "Welcome Back!", "",JOptionPane.INFORMATION_MESSAGE);
            	
        	}
        	else
        	{
        		lostVoice();
            	JOptionPane.showMessageDialog(Dialog, "The User Name or Password is incorrect. Please try again.", "",JOptionPane.WARNING_MESSAGE);
        	}
        	
        }
 
}
    public static void main(String[] args) 
    {
		
    	new VoiceEx1();
    	
	}
}
 
