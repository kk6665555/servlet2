package tw.mike.j2ee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class J2EE28
 */
@WebServlet("/J2EE28")
public class J2EE28 extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//¼´cookie
			
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			request.setCharacterEncoding("UTF-8");
			
			String account ="",password ="";
			boolean istrue = false;
			HashMap<String, String> map = new HashMap<>();	
			Cookie[] cookies =  request.getCookies();
			if (cookies != null) { 	
				for(Cookie cookie:cookies) {
					String name = cookie.getName();
					String value = cookie.getValue();					
					map.put(name, value);
					
				}
				
			}

			
			if(map.containsKey("remember")) {
				if(map.get("remember").equals("true")) {
					out.println(map.get("account") + ":" + map.get("password"));
				}else {
					out.print("no account");
				}
			}else {
				out.print("no coolies");
			}
	}
}
