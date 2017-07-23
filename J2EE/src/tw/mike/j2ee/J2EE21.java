package tw.mike.j2ee;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class J2EE21
 */
@WebServlet("/J2EE21")
public class J2EE21 extends HttpServlet {
		private String file;

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			request.setCharacterEncoding("UTF-8");
			
			
			String x = (String)request.getAttribute("x");
			String y = (String)request.getAttribute("y");
			Integer result = (Integer)request.getAttribute("result");
			
//			out.println(x + "+" + y + "=" + result);
			
			String html =loadview("mycal.html");
			html = String.format(html,x,y,result);
			out.println(html);
	}

	private String loadview(String file) {
		String tmpPath = getServletContext().getInitParameter("template-path");
		File viewfile =new File(tmpPath, file );
		
		int len = (int)viewfile.length();
		byte[] buf = new byte[len];
		try {
		BufferedInputStream bin = new BufferedInputStream(new FileInputStream(viewfile));
		bin.read(buf);
		bin.close();
		}catch(Exception e) {
			
		}
		
		return new String(buf);
	}

}
