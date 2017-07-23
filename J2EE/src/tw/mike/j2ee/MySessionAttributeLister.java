package tw.mike.j2ee;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
@WebListener
public class MySessionAttributeLister  implements HttpSessionAttributeListener{

	@Override
	
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
//		arg0.getSession();
		String name= arg0.getName();
		String value=(String) arg0.getValue();
		System.out.println("Add:" + name+":"+value);
		
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		String name= arg0.getName();
		String value=(String) arg0.getValue();
		System.out.println("Removed:"+name+":"+value);
		
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		String name= arg0.getName();
		String value=(String) arg0.getValue();
		System.out.println("Replaced"+name+":"+value);
		
		HttpSession session = arg0.getSession();
		String value1= (String)session.getAttribute(name);
		System.out.println("Replaced"+name+":"+value1);
		
	}

}
