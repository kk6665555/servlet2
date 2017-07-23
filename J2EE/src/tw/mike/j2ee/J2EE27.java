package tw.mike.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class J2EE27
 */
@WebServlet("/J2EE27")
public class J2EE27 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		Cookie account = new Cookie("remember", "true");
		account.setMaxAge(1*60);//1╓юда
		response.addCookie(account);
		
		Cookie account1 = new Cookie("account", "mike1");
		account1.setMaxAge(1*60);//1╓юда
		response.addCookie(account1);
		
		Cookie account2 = new Cookie("password", "886677");
		account2.setMaxAge(1*60);//1╓юда
		response.addCookie(account2);
		
		
		
	}
}
