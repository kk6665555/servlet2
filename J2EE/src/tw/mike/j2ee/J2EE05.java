package tw.mike.j2ee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class J2EE05
 */
@WebServlet("/J2EE05")
public class J2EE05 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doTask(request,response,"doGet");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doTask(request,response,"doPost");
	}
	private void doTask(HttpServletRequest request, HttpServletResponse response,String what) throws ServletException, IOException  {
		
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		
		Enumeration<String> pa = request.getParameterNames();
		while(pa.hasMoreElements()){
			String paa = pa.nextElement();
			String value = request.getParameter(paa);
			
			pw.write(paa + ":" + value + "<br>");
		}
		pw.flush();
		pw.close();
		
		PrintWriter printWriter = response.getWriter();
		printWriter.write("doTask");
		printWriter.flush();
	}
	
}
