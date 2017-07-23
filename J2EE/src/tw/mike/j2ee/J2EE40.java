package tw.mike.j2ee;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Set;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.sun.xml.internal.ws.api.policy.PolicyResolver.ServerContext;
@WebServlet(name="J2EE40",urlPatterns= {"/J2EE40","/J2EE40.php","/J2EE40.aspx"},
	initParams= {@WebInitParam(name="x",value="123"),
				 @WebInitParam(name="y",value="456")}
)
public class J2EE40 extends HttpServlet {
	private ServletContext ServerContext;
	private ServletConfig ServletConfig;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
//		System.out.println("init");
		ServletConfig = getServletConfig();
		ServerContext = getServletContext();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.service(req, resp); //觸發doGet or doPost
//		System.out.println("service");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		System.out.println("doGet");
		Enumeration<String> params = ServletConfig.getInitParameterNames();
		while(params.hasMoreElements()) {
			String param = params.nextElement();
			System.out.println(param+"="+ServletConfig.getInitParameter(param));
		}
		
		 String realpath = ServerContext.getRealPath("/");
		 System.out.println(realpath);
		 Set<String> paths = ServerContext.getResourcePaths("/");
		 for(String path:paths) {
			 System.out.println(path);
		 }
	}
	
	
}
