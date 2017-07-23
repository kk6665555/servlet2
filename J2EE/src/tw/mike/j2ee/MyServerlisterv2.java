package tw.mike.j2ee;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.AsyncContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServerlisterv2 implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		ServletContext ServletContext= arg0.getServletContext();
		List<AsyncContext> asyncs =new LinkedList<>();
		ServletContext.setAttribute("asyncs", asyncs);
	}

}
