import java.awt.*;

public class TitleIconEx 
{
	
	
	public TitleIconEx() 
	{
		Frame f=new Frame();     
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Admin\\Downloads\\zetong-li-UZ3V6AV5y4o-unsplash.jpg");    
		f.setIconImage(icon);    
		f.setLayout(null);     
		f.setSize(400,400);     
		f.setVisible(true);     
	}
	public static void main(String[] args) 
	{
		new TitleIconEx();
	}
}
