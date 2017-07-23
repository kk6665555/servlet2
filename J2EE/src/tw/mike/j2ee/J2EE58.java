package tw.mike.j2ee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.AsyncContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/J2EE58")
public class J2EE58 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ServletContext = getServletContext();
		List<AsyncContext> asyncs = (List)ServletContext.getAttribute("asyncs");
		//將要求推撥出去
		synchronized (asyncs) {
			for(AsyncContext asyconContext:asyncs) {
				PrintWriter out =asyconContext.getResponse().getWriter();
				out.print("Message:"+ Math.random()*49+1);
				asyconContext.complete();
			}
			asyncs.clear();
		}		
		
	};

}
