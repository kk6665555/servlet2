package tw.mike.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class J2EE19
 */
@WebServlet("/J2EE19")

public class J2EE19 extends HttpServlet {
	
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			request.setCharacterEncoding("UTF-8");
			
			String x = request.getParameter("x");
			String y = request.getParameter("y");
			
			if(x == null) x = "0";
			if(y == null) x = "0";
			//model
			J2EE20 model = new J2EE20(x,y);
			int result = model.add();
			
			
			
			
			//forward -> view
			//лсн▒+ ?x=5&&y=10
			request.setAttribute("x", x);
			request.setAttribute("y", y);
			request.setAttribute("result", result);
			request.getRequestDispatcher("J2EE21").forward(request, response);
			
			
			
			
				
			
	}
}
