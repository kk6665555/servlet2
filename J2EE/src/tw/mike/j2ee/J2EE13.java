package tw.mike.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/J2EE13")
@MultipartConfig
public class J2EE13 extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		String uploadPath = getServletContext().getInitParameter("upload-path");
		Part part = request.getPart("upload");
		
//		String filename = part.getSubmittedFileName();
		
		String header = part.getHeader("Content-Disposition");
		String filename = J2EEAPI.getHeaderFileName(header);
		part.write(uploadPath + "/" + filename);
		out.print("Upload Success");
	}

}
