package tw.mike.j2ee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class J2EE43
 */
@WebServlet("/J2EE43")
public class J2EE43 extends HttpServlet {
	private ServletContext ServletContext;
	private Connection conn1,conn2;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext = getServletContext();
		
		
		try {
			 conn1 = (Connection)ServletContext.getAttribute("conn");
			Statement stmt = conn1.createStatement();
			stmt.executeUpdate("insert into member (account,password,realname) values ('1','2','3')");
			System.out.println("OK2");
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 conn2=DriverManager.getConnection(
					"jdbc:mysql://localhost/oneone","root","root");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println(conn1==conn2);
	}

}
