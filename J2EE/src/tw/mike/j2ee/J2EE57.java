package tw.mike.j2ee;

import java.io.IOException;
import java.util.List;

import javax.servlet.AsyncContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/J2EE57",asyncSupported=true)
public class J2EE57 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ServletContext ServletContext = getServletContext();
		List<AsyncContext> asyncs = (List)ServletContext.getAttribute("asyncs");
		System.out.println(asyncs.getClass().getName());
		synchronized (asyncs) {//鎖定
			asyncs.add(request.startAsync());
		}
		
	}
	

}
