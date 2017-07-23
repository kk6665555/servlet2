package tw.mike.j2ee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import javax.servlet.annotation.WebListener;







@WebListener
public class MyServerListener implements ServletContextListener{
	private ServletContext ServletContext;
	private Timer timer;
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("destroy");
		if((boolean)ServletContext.getAttribute("isConnection")&&
				ServletContext.getAttribute("conn")!=null) {
			Connection conn =(Connection)ServletContext.getAttribute("conn");
			try {
			conn.close();
			}catch(Exception e) {
				System.out.println("My Sql Close Error");
			}
		}
		
		if (timer != null) {
			timer.cancel();
			timer.purge();
			timer = null;
		}
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("init");
		ServletContext ServletContext = arg0.getServletContext();
		ServletContext.setAttribute("key3", "value3");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/oneone","root","root");
			ServletContext.setAttribute("conn",conn);
			ServletContext.setAttribute("isConnection", true);
			System.out.println("ok");
		} catch (Exception e) {
			ServletContext.setAttribute("isConnection", false);
			System.out.println(e);
		}
		
		timer = new Timer();
//		timer.schedule(new MyTask(), 1*1000, 1*1000);
	}
	
	
	
	private class MyTask extends TimerTask {
		@Override
		public void run() {
			System.out.println("TimerTask");
		}
	}
	
}
