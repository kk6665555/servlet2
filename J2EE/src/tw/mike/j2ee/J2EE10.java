package tw.mike.j2ee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class J2EE10
 */
@WebServlet("/J2EE10")
public class J2EE10 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gender = request.getParameter("gender");
		
		String[] hobby = request.getParameterValues("hobby");
		
		
		response.setContentType("Text/html;charset=utf-8");
//		response.getWriter().write(hobby);
		StringBuffer sb = new StringBuffer();
		
		for ( String h:hobby) {
			sb.append(h+"\n");
		}
		response.getWriter().write(sb.toString());
	}

	

}
