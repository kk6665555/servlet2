package tw.mike.j2ee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class J2EE08
 */
@WebServlet("/J2EE08")
public class J2EE08 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int x, y,result,sele;
		
		try {
			 x = Integer.parseInt(request.getParameter("x"));
			 y = Integer.parseInt(request.getParameter("x"));
			 sele = Integer.parseInt(request.getParameter("sele"));

			 
			 switch(sele) {
			  case 1:
				  result= x + y; break;	  
			  case 2:
				  result= x - y; break;
			  case 3:
				  result= x * y; break;
			  case 4:
				  result= x / y; break;
			  default :
			  	result = 0; break;
				  
			 }
		} catch (Exception e) {
			x=y=result=sele=0;
		}
			
		
		
		
		response.setContentType("Text/html;charset=utf-8");
		response.getWriter().append("<form>")
		.append("<input type='Text' name = 'x' value='"+ x +"'/>" )
		.append("<select name='sele'>")
		.append("<option value='1'>+</option>")
		.append("<option value='2'>-</option>")
		.append("<option value='3'>*</option>")
		.append("<option value='4'>/</option>")
		.append("</select>")
		.append("<input  type = 'Text' name = 'y' value='"+ y +"'>")
		.append("<input  type= 'submit' value='GO'/>")
		.append("<span style='color:red'>" + result + "</span>");
//		.append("</form>");
		
		
	}

}
