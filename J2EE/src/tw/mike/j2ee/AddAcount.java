package tw.mike.j2ee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddAcount")
public class AddAcount extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
				String account = request.getParameter("account");
				String password = request.getParameter("password");
				
		if(account != null) {
			addAccount(account,password);
			response.sendRedirect("main");//Âà¦V
		}
				
				
		
		out.println("<form>");
		out.println("Account:<input name='account'></br>");
		out.println("Password:<input type='password' name='password'></br>");
		out.println("<input type='submit' value='Add'></br>");
		out.println("</form>");
		
		
	}
	private void addAccount(String account , String password) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Properties prop = new Properties();
			prop.setProperty("user", "root");
			prop.setProperty("password", "root");
			
			
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/iii",prop);
			PreparedStatement pstmt = conn.prepareStatement("insert into cust(account,password) values(?,?)");
			//¥iÁ×§KÁô½X§ðÀ»
			
			String salt = BCrypt.gensalt(12);
			pstmt.setString(1, account);
			pstmt.setString(2, BCrypt.hashpw(password, salt));
			pstmt.executeUpdate();
			
			
			
			
//			Statement stmt =  conn.createStatement();
//			stmt.execute("insert into cust(account,password) values('mike','123')");
//			stmt.close();
			System.out.println("ok");

			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	
}
