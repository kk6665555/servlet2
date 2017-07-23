package tw.mike.j2ee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class J2EE23
 */
@WebServlet("/J2EE23")
public class J2EE23 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		
   		String salt = BCrypt.gensalt(12);
   		String NewPassword = BCrypt.hashpw("123456", salt);
   		System.out.println(NewPassword);
   		
			if(ckPassword("123456",NewPassword)) {
				System.out.println("ok");
			}else {
				System.out.println("xx");
			}
		
	}
   	
   	private static boolean ckPassword( String orgPassword,String hashPassord) {
   		boolean isRight = false;
   		if(hashPassord == null || !hashPassord.startsWith("$2a$")) {
   			isRight=false;
   			
   		}
   		isRight = BCrypt.checkpw(orgPassword, hashPassord);
   		return true;
   	}
}
