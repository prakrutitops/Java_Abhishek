import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao 
{
	
	public static Connection getconnect() throws SQLException, ClassNotFoundException
	{
		Connection con = null;
		
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/croma","root","");
		
		return con;
	}
	
	public static int savedata(Model m) throws SQLException, ClassNotFoundException
	{
		int status =0;
		
		Connection con = Dao.getconnect();
		
		String sql = "insert into test(name) values(?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,m.getName());
		status = ps.executeUpdate();
		
		return status;
	}
	
	
	
}
