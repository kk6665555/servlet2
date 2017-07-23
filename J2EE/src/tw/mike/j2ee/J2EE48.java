package tw.mike.j2ee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class J2EE48
 */
@WebServlet("/J2EE48")
public class J2EE48 extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			
			HttpSession session =request.getSession();
			session.setAttribute("user", "mike");
			session.setAttribute("stage", "two");
	}
}
