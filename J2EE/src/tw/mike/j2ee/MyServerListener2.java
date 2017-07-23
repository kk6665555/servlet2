package tw.mike.j2ee;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServerListener2 implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("destroy");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("init");
	}
	
}
