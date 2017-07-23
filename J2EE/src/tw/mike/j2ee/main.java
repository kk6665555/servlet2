package tw.mike.j2ee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

/**
 * Servlet implementation class main
 */
@WebServlet("/main")
public class main extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			request.setCharacterEncoding("UTF-8");
			ResultSet rs = null ;
			
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Properties prop = new Properties();
				prop.setProperty("user", "root");
				prop.setProperty("password", "root");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/iii",prop);
				
				String delid = request.getParameter("delid");
				if (delid != null) {
					conn.createStatement().executeUpdate("delete from cust where id = " + delid);
				}
				
				
				
				PreparedStatement pstmt = conn.prepareStatement("select * from cust");
				//¥iÁ×§KÁô½X§ðÀ»
				
				 rs = pstmt.executeQuery();
				
//				Statement stmt =  conn.createStatement();
//				stmt.execute("insert into cust(account,password) values('mike','123')");
//				stmt.close();
				System.out.println("ok");

				
			} catch (Exception e) {
				System.out.println(e);
			}
			
			
			out.println("<meta charset='UTF-8'>");
			out.println("<a href = 'AddAcount'>Add</a>");
			out.println("<table border='2' width = '100%'>");
			out.println("<tr>"+
							"<th>ID<th>"+
							"<th>Name<th>"+
							"<th>Password<th>"+
							"<th>Delete<th>"+
						"</tr>");
			
			try {
				if(rs != null) {
					while(rs.next()) {
					String id = rs.getString("id");
					String account = rs.getString("account");
					out.print("<tr>");
					out.print("<td>" + id +"<td>");
					out.print("<td>" + rs.getString("account")+"<td>");
					out.print("<td>" + rs.getString("password")+"<td>");
					out.print("<td><a href='?delid=" + id + "' onclick='return confirm(\"Delete"+account+"?\");'>Delete</a></td>");
					out.print("</tr>");
					}
				}
			}catch(Exception e){
				
			}
			out.println("</table>");
	}
}
