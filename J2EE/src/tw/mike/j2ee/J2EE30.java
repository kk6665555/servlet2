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
			HttpSession session = request.getSession();//�p�G�S���s�bsession �N�Ыؤ@��create a new
//			HttpSession session = request.getSession(true);//�p�G�S���s�bsession �N�Ыؤ@��create a new
//			HttpSession session = request.getSession(false);//�p�G�S���s�bsession ���إ�
			Member member = new Member("childen",10);
			session.setAttribute("who", member);
			
			
			
			
	}
}
