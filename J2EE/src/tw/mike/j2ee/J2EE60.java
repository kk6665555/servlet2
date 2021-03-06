package tw.mike.j2ee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.servlet.AsyncContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/J2EE60")
public class J2EE60 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mesg = request.getParameter("msg");
		//更新資料庫訊息
		Connection conn = (Connection)getServletContext().getAttribute("conn");
		if(conn!=null) {
			
			try {
				
				Statement stmt = conn.createStatement();
				stmt.executeUpdate("insert into message(mesg) values ('"+ mesg +"')");
			} catch (SQLException e) {
				
				System.out.println(e);
			}
			
		}
		
		//發送
		ServletContext servletContext = getServletContext();

		List<AsyncContext> asyncs = (List)servletContext.getAttribute("asyncs");
		
		synchronized (asyncs) {
			for(AsyncContext asyconContext : asyncs) {
				System.out.println("ok");
				HttpServletResponse resp = (HttpServletResponse)asyconContext.getResponse();
				resp.setContentType("text/html; charset=UTF-8");
				PrintWriter out =resp.getWriter();
				out.print(mesg);
				asyconContext.complete();
			}
			asyncs.clear();
		};		
		
		
		response.sendRedirect("J2EE93.html");
		
		
	}
	

}
