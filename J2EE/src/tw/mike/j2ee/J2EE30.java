package tw.mike.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class J2EE30
 */
@WebServlet("/J2EE30")
public class J2EE30 extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session = request.getSession();//如果沒有存在session 就創建一個create a new
//			HttpSession session = request.getSession(true);//如果沒有存在session 就創建一個create a new
//			HttpSession session = request.getSession(false);//如果沒有存在session 不建立
			Member member = new Member("childen",10);
			session.setAttribute("who", member);
			
			
			
			
	}
}
