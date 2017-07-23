package tw.mike.j2ee;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/J2EE42")
public class J2EE42 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ServletContext = getServletContext();
		if(ServletContext.getAttribute("key1")!=null) {
			ServletContext.removeAttribute("key1");
		}
		System.out.println(ServletContext.getAttribute("key1"));
		System.out.println(ServletContext.getAttribute("key3"));
		
	}

}
