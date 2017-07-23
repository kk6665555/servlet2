package tw.mike.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/J2EE15")
public class J2EE15 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		
//		RequestDispatcher dispatcher = request.getRequestDispatcher("J2EE16?name=Brad&status=OK");
//		RequestDispatcher dispatcher2 = request.getRequestDispatcher("J2EE17");
		out.println("<h1>Mike view</h1>");
		out.println("<hr/>");
		
		//includ
//		dispatcher.include(request, response);
		request.getRequestDispatcher("J2EE16?name=test").include(request, response);;
		out.println("<hr/>");
//		dispatcher2.include(request, response);
		
		out.println("<hr/>");
		out.println("Copyleft");
	}
}
