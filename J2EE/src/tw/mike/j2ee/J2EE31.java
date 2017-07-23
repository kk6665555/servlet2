package tw.mike.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.SessionCookieConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class J2EE31
 */
@WebServlet("/J2EE31")
public class J2EE31 extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			request.setCharacterEncoding("UTF-8");
			
			//有session才能運作否則錯誤
			
			HttpSession session = request.getSession(false);
			if(session==null) {
				out.println("NO");
				return;			
			}
			
			Member member=(Member) session.getAttribute("who");
			out.print(member.getName()+":"+member.getAge());
			
			
	}
	
}
