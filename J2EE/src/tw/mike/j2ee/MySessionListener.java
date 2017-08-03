package tw.mike.j2ee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MySessionListener implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("sessionCreated:" + new Date().toString());
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
						"jdbc:mysql://localhost/oneone","root","root");
			Statement stmt =conn.createStatement();
			HttpSession session=arg0.getSession();
			String dbid = (String)session.getAttribute("dbid");
			stmt.executeUpdate(
				"update member set islogin=0 where id=" + dbid);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("sessionDestroyed:"+ new Date().toString());	
	}

}
