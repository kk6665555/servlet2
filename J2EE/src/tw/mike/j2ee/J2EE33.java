package tw.mike.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class J2EE33
 */
@WebServlet("/J2EE33")
public class J2EE33 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		
		new Thread(()->{//��������|�b�e�����B�@
			out.println("ok");
			for (int i = 0;i<=20;i++) {
				out.println("ok" + i);
				System.out.println(i);
				
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					
				}
			}
			
		}).start();	
			
	}
}
