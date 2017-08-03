package tw.mike.j2ee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/J2EE47")
public class J2EE47 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection(
						"jdbc:mysql://localhost/oneone","root","root");
			HttpSession session = request.getSession(false);
				
			if(session!=null) {	 
				String dbid= (String)session.getAttribute("dbid");
				Statement stmt= conn.createStatement();
				stmt.executeUpdate("update member set islogin=0 where account= " + dbid);
				session.invalidate();
			}
				
			
			
			
			
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}
}
