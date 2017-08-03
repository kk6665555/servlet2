
package tw.mike.j2ee;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/iii/J2EE01")
public class J2EE01 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
//		System.out.println("DoGet");
		
//		try(PrintWriter aa =  response.getWriter()){
//			String text = URLEncoder.encode("http://opecnhome.cc","ISO-8859-1");//�Ѽ� �O�d�r���ݭn�S�O�ϥ�
//		aa.write("Hello,Word");
//		aa.write(text);
//		aa.flush();
		response.setContentType("text/html; charset=UTF-8");
		try (PrintWriter writer = response.getWriter()){
			writer.write("Hello, World");
			writer.flush();
		}
		System.out.println("I am Brad01");
		}
	}


