package tw.mike.j2ee;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;



@WebListener
public class MyRequestAttributeLister implements ServletRequestAttributeListener{

	@Override
	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		String name = arg0.getName();
		String value =(String)arg0.getValue();
		System.out.println("request ADD:" + name+":"+value);
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		String name = arg0.getName();
		String value =(String)arg0.getValue();
		System.out.println("request Removed:" + name+":"+value);
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		String name = arg0.getName();
		System.out.println("request replace attribute: " + name);
		if (name.equals("x")) {
			String value = (String)arg0.getValue();
			System.out.println("request attribute replace before: " + name + " -> " + value);
			
			ServletRequest req = arg0.getServletRequest();
			String v2 = (String)req.getAttribute(name);
			System.out.println("request attribute replace after: " + name + " -> " + v2);
		}
		
	
		
		
	}

}
