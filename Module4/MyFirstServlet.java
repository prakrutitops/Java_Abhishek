import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/send")
public class MyFirstServlet extends HttpServlet
{
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		
				
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		
		if(pass.equals("1234"))
		{
			out.print("welcome "+name);
		}
		else
		{
			out.print("fail");
		}
		
		
		
	}
}
