package tw.mike.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class J2EE07
 */
@WebServlet("/J2EE07")
public class J2EE07 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));
		int result = x + y ;
		
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write(String.valueOf(result));
//		PrintWriter pw = response.getWriter();
//		pw.write(x + "+" + y + "=" + result);
//		pw.flush();
//		pw.close();

	}


}
