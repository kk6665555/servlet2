package tw.mike.j2ee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/J2EE22")
public class J2EE22 extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			request.setCharacterEncoding("UTF-8");
			textSQL();		
	}
		private void textSQL() {
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/iii?user=root&password=root");
				Statement stmt =  conn.createStatement();
				stmt.execute("insert into cust(account,password) values('mike','123')");
				stmt.close();
				System.out.println("ok");

				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
}
