package tw.mike.j2ee;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

import org.omg.CORBA.ServerRequest;



@WebListener
public class MyRequestLister implements ServletRequestListener{

	
	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		ServletRequest req = arg0.getServletRequest();
		String remoteIP = req.getRemoteAddr();
		System.out.println("new request from: " + remoteIP);
	}
	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
			
	}

	

}
