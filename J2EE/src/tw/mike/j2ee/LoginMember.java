package tw.mike.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.mike.beans.Member2;

@WebServlet("/LoginMember")
public class LoginMember extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		//1.prepare
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		
		//2.Model
		Member2 member;
		try {
			member = new Member2();
			member.setAccount(account);
			member.setPassword(password);
			
			if(member.isValidMemeber()) {
//				out.println("ok");
				HttpSession session=request.getSession();
				session.setAttribute("member", member);
				response.sendRedirect("Main2");
			}else {
				out.print("xx");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}
