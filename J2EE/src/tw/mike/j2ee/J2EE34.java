package tw.mike.j2ee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class J2EE34
 */
@WebServlet("/J2EE34")
public class J2EE34 extends HttpServlet {
	private int i ;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		new Timer().schedule(new MyTesk(), 1000,1000);
	}
	
	private class MyTesk extends TimerTask{
		@Override
		public void run() {
			System.out.println(i++);
			
		}
	}
}
