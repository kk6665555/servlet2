package tw.mike.j2ee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/J2EE46")
public class J2EE46 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection(
						"jdbc:mysql://localhost/oneone","root","root");
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(60);
			Statement stmt= conn.createStatement();
			
			ResultSet rs =stmt.executeQuery("select * from memebr where account='Peter' and islogin=0");
			if(rs.next()) {
				
			}
			
			
			stmt.executeUpdate("update member set islogin=1 where account='Peter'");
			session.setAttribute("dbid", "1");
			
			System.out.println("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
